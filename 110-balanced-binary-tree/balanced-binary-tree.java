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
    public boolean isBalanced(TreeNode root) {



        return find(root)!=-1;
        
    }

    public static  int find(TreeNode root)
    {
        if(root==null)
        return 0;

        int left=find(root.left);

        if(left==-1)
        {
            return -1;
        }

        int right=find(root.right);
        if(right==-1)
        {
            return -1;
        }


        int t=Math.abs(left-right);
        if(t>1)
        {
            return -1;
        }


        return Math.max(left,right)+1;
    }
}