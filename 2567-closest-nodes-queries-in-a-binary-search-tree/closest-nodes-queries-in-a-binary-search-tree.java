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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> q) {

        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ll=new ArrayList<>();

        

        preorder(root,l);

        System.out.println(l);


        for(int t=0;t<q.size();t++)
        {
              int n=q.get(t);
            List<Integer>a=new ArrayList<>();
            int i=0;
            int j=l.size()-1;
                 int min=-1;
            while(i<=j)
            {
                int mid=(i+j)/2;

            

                if(l.get(mid)>n)
                {
                    j=mid-1;
                }
                else if(l.get(mid)==n)
                {
                    min=mid;
                    break;
                }
                else
                {
                   
                    min=mid;
                    i=mid+1;

                }

            }

            i=0;
            j=l.size()-1;
            int max=-1;

             while(i<=j)
            {
                int mid=(i+j)/2;

               

                if(l.get(mid)<n)
                {
                    i=mid+1;

                }
                else if(l.get(mid)==n)
                {
                    max=mid;
                    break;
                }
                else
                {
                    
                    max=mid;
                    j=mid-1;

                }

            }
             if(min>-1)
             a.add(l.get(min));
             else
             a.add(-1);
             if(max>-1)
             a.add(l.get(max));
             else
             a.add(-1);


             ll.add(a);

        }





            return ll;

        



        
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