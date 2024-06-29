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

    private int ans=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {

        if(root==null)
        return 0;

        find(root,1);

        return ans;


        


        
    }

private void find(TreeNode root,int k)
    {
        if(root==null)
        {
           return;
        }

        if(root.left==null && root.right==null)
        {
            if(ans>k)
            {
                ans=k;
            }
        }
        

       find(root.left,k+1);
     find(root.right,k+1);
  

        




    



        
    }
}