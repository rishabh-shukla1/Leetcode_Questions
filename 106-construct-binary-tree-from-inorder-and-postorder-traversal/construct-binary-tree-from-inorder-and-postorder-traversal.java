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
    public TreeNode buildTree(int[] inorder, int[] postorder) {


        return create(postorder,inorder,0,postorder.length-1,0,inorder.length-1);
        
    }

    public static TreeNode create(int post[],int in[],int plo,int phi,int ilo,int ihi)
    {
        if(ilo>ihi ||plo>phi)
        {
            return null;
        }

        TreeNode root=new TreeNode(post[phi]);

        int idx=search(in,post[phi],ilo,ihi);

        int c=idx-ilo;


        
        root.left=create(post,in,plo,plo+c-1,ilo,idx-1);
        root.right=create(post,in,plo+c,phi-1,idx+1,ihi);

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

        return 0;
    }
}