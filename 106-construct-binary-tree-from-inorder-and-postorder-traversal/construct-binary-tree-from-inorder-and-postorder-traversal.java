/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    static int p;
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        p=postorder.length-1;




        return create(postorder,inorder,0,inorder.length-1);
        
    }

    public static TreeNode create(int post[],int in[],int ilo,int ihi)
    {
        if(ilo>ihi )
        {
            return null;
        }

        TreeNode root=new TreeNode(post[p--]);

        if(ilo==ihi)
        {
            return root;
        }

        int idx=search(in,root.val,ilo,ihi);


          root.right=create(post,in,idx+1,ihi);

        root.left=create(post,in,ilo,idx-1);
      
        return root;





    }

    public static int search(int in[],int post,int l,int h)
    {
        for(int i=l;i<=h;i++)
        {
            if(in[i]==post)
            {
                return i;
            }
        }

        return -1;
    }
}