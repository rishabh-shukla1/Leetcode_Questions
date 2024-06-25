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
    public int kthSmallest(TreeNode root, int k) {


         List<Integer> l=new ArrayList<>();
          preorder(root,l);

          return l.get(k-1);
        
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