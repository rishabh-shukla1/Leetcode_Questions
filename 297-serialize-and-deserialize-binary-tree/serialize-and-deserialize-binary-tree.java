/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder s=new StringBuilder();

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            TreeNode t=q.poll();

            if(t!=null)
            {
                s.append(t.val).append(',');
                q.add(t.left);
                q.add(t.right);
            }
            else
            {
                s.append("null,");
            }
        }

        return s.toString();


        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {

        if(s==null)
        {
            return null;
        }

        String arr[]=s.split(",");

       if(arr[0].equals("null"))
       {
        return null;
       }

        

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
       

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;

        while(!q.isEmpty())
        {
            TreeNode t=q.poll();

            if(i<arr.length && !arr[i].equals("null"))
            {
                t.left=new TreeNode(Integer.parseInt(arr[i]));

                q.add(t.left);

            }
            i++;

            if(i<arr.length && !arr[i].equals("null"))
            {
                t.right=new TreeNode(Integer.parseInt(arr[i]));

                q.add(t.right);

            }
            i++;
        }


        return root;


        
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));