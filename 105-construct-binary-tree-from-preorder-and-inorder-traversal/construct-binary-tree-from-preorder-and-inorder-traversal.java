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
    public TreeNode buildTree(int[] preorder, int[] inorder) {


    return create(preorder, inorder, 0,preorder.length-1,0,inorder.length-1);
        
    }

    public static TreeNode create(int pre[],int in[],int plo,int phi,int ilo,int ihi)
    {

        if(plo>phi || ilo>ihi)
        {
            return null;
        }

        TreeNode root=new TreeNode(pre[plo]);

        int idx=search(pre[plo],in,ihi,ilo);

        int c=idx-ilo;

        root.left=create(pre,in,plo+1,plo+c,ilo,idx-1);
        root.right=create(pre,in,plo+c+1,phi,idx+1,ihi);

        return root;


        

    }

    public static int search(int pre,int in[],int h, int l)
    {
        for(int i=l;i<=h;i++)
        {
            if(in[i]==pre)
            {
                return i;
            }
        }

        return 0;

    }
}