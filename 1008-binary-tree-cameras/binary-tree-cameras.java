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
    int camera=0;
    public int minCameraCover(TreeNode root) {

         camera=0;
        int ans=find(root);


        if(ans==0)
        {
            return ++camera;
        }


        return camera;




        
    }
    private int find(TreeNode root)
    {

        if(root==null)
        return 1;

        int left=find(root.left);
        int right=find(root.right);


         if(left==0 || right==0)
        {
            camera++;
           return 2;
        }

        if(left==1 && right==1)
        {
            return 0;
        }

       

        if(left==2  || right==2)
        return 1;


        return -1;

         
        
    }
}