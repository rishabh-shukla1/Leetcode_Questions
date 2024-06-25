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
    public boolean isValidBST(TreeNode root) {
         List<Integer> l=new ArrayList<>();
       

        

        preorder(root,l);

        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i)>=l.get(i+1))
            return false;
        }

        return true;
        
    }
    public static void preorder(TreeNode root,List<Integer>l)
 {
    if(root==null)
    {
        return ;
    }

    preorder(root.left,l);
    l.add(root.val);
    preorder(root.right,l);
 }
}