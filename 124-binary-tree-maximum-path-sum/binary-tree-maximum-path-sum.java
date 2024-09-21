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

     int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        if(root==null)
        {
            return 0;
        }

        post(root);



        return sum;
        
    }

    public  int post(TreeNode root)
    
    {

        if(root==null)
        {
            return 0;
        }

        int l=Math.max(post(root.left),0);
        int r=Math.max(post(root.right),0);

        int curr=l+r+root.val;

        sum=Math.max(sum,curr);

        return root.val+Math.max(l,r);

    }
}