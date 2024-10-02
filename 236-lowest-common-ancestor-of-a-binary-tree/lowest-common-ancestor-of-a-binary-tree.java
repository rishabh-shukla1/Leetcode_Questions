/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        return find(root,p,q);
        
    }

    public static TreeNode find(TreeNode root,TreeNode p, TreeNode q)
    {

        if(root==null)
        {
            return null;
        }


        if(root==p || root==q)
        {
            return root;
        }

       TreeNode l= find(root.left,p,q);
       TreeNode r =find(root.right,p,q);

        if(l!=null && r!=null)
        {
            return root;

        }
        else if(l==null)
        {
            return r;
                    }
                    else
                    {
                        return l;
                    }

    }
}