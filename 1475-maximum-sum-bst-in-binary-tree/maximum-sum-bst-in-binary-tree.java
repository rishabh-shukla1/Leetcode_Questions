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
    public int maxSumBST(TreeNode root) {

        

        return valid(root).ans;


        
    }

    public  bstpair valid(TreeNode root)
    {
        if(root==null)
        {
            return new bstpair();
        }

        bstpair l=valid(root.left);
        bstpair r=valid(root.right);

        bstpair s=new bstpair();
        s.min=Math.min(l.min,Math.min(r.min,root.val));
        s.max=Math.max(l.max,Math.max(r.max,root.val));
        s.sum=l.sum+r.sum+root.val;

        s.isbst=l.isbst && r.isbst && root.val>l.max && root.val<r.min;

        if(s.isbst)
        {
            s.ans=Math.max(l.ans,Math.max(s.sum,r.ans));

        }
        else
        {
            s.ans=Math.max(l.ans,r.ans);
        }



        return s;

        


    }

    class bstpair{

        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;

        boolean isbst=true;

        int sum=0;
        int ans=0;

    }
}