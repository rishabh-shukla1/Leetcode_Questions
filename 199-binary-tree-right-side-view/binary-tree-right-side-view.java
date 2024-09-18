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

    int maxdepth=0;
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer>ans=new ArrayList<>();

        find(root,ans,1);

        return ans;
        
    }

    public void find(TreeNode root,List<Integer>ans,int currl)
    {
        if(root==null)
        {
            return ;
        }

        if(currl>maxdepth)
        {
            ans.add(root.val);
            maxdepth=currl;
        }

        find(root.right,ans,currl+1);
        find(root.left,ans,currl+1);
        

        
    }


}