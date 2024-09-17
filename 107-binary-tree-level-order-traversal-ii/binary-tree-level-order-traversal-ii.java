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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

      
        List<List<Integer>>ll=new ArrayList<>();
        if(root==null)
        {
            return ll;
        }


        create(root,ll);

        Collections.reverse(ll);

        return ll;
        
    }

    public static void create(TreeNode root,List<List<Integer>>ll)
    {
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);

        while(true)
        {

            List<Integer> l=new ArrayList<>();
            int len=q.size();
            
            if(len==0)
            {
                break;
            }

            while(len>0)
            {
                TreeNode t=q.poll();

                l.add(t.val);
               

              

              

                if(t.left!=null)
                {
                    q.add(t.left);

                }
                if(t.right!=null)
                {
                    q.add(t.right);

                }

                len--;

            }

            ll.add(l);
        }




    }
}