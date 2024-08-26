/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {

       List<Integer>l=new ArrayList<>();

       if(root==null)
       return l;

       solve(l,root);
       l.add(root.val);

       return l;
        
    }

    private void solve(List<Integer>l ,Node root)
    {
        List<Node> li=new ArrayList<>();

        li=root.children;

        for(int i=0;i<li.size();i++)
        {
            if(li.get(i)==null)
             continue;


             solve(l,li.get(i));
             l.add(li.get(i).val);
        }



    }
}