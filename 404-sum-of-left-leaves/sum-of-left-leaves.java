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


    static int ans;
    
    public int sumOfLeftLeaves(TreeNode root) {

        ans=0;
         
        find(root);


        return ans;
        
    }

    public static void find(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null)
            ans=ans+root.left.val;
        }

        find(root.left);
        find(root.right);
    }
}