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
    public List<Integer> largestValues(TreeNode root) {

        
List<Integer> l =new ArrayList<>();

        if(root==null)
        {
            return l;
        }
        find(root,l);

        return l;
        
    }

    public static void find(TreeNode root, List<Integer>l)
    {

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
      

        while(true)
        {

            List<Integer> ans=new ArrayList<>();

            int len=q.size();

            if(len==0)
            {
                break;
            }

            while(len>0)
            {
                TreeNode node=q.peek();
                ans.add(q.peek().val);
                q.remove();
                

                if(node.left!=null)
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
                len--;

            }

            Collections.sort(ans);

            l.add(ans.get(ans.size()-1));
        
        } 
        
    }
}