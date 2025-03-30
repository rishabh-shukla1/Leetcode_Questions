/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {


        if(root==null)
        {
            return root;
        }


        Queue<Node> q=new LinkedList<>();

        q.add(root);

        while(true)
        {
            int len=q.size();

            if(len==0)
            {
                break;
            }

            Node prev=null;

            while(len>0)
            {

                Node t=q.poll();

                if(t.left!=null)
                {
                    q.add(t.left);
                }

                if(t.right!=null)
                {
                    q.add(t.right);
                }

                if(prev!=null)
                {
                    prev.next=t;
                }

                prev=t;
                len--;
            }



            
        }


        return root;
        
    }
}