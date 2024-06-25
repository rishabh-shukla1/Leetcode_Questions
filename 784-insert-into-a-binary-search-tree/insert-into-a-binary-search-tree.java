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
    public TreeNode insertIntoBST(TreeNode root, int val) {
              TreeNode n=new TreeNode(val);
           if(root==null)
           {

            root=n;
           return root;
           }

          

           TreeNode temp=root;
           TreeNode prev=null;

           while(temp!=null)
           {
            if(temp.val>val)
            {
                prev=temp;
                temp=temp.left;
            }
            else if(temp.val<val)
            {
                prev=temp;
                temp=temp.right;
            }
           }

           if(prev.val>val)
           {
            prev.left=n;
           }
           else
           {
            prev.right=n;

           }



           return root;
     



        
    }
}