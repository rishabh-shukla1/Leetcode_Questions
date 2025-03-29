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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> s=new ArrayList<>();

        find(root,s,"");


        return s;
        
    }

    public static void find(TreeNode root, List<String> l, String s)
    {

        if(root==null)
        {
            return ;
        }

        s=s+root.val;

        


        if(root.left==null  && root.right==null)
        {
            l.add(s);
            
        }

        
        s=s+"->";
        find(root.left,l,s);
        find(root.right,l,s);
        

    }
}