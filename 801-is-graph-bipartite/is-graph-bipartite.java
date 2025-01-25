class Solution {
    public boolean isBipartite(int[][] graph) {

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<graph.length;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                adj.get(i).add(graph[i][j]);
            
            }
        }
       

         int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++)
        {
            if(color[i]==-1)
            {
                if(bfs(i,color,adj)==false)
                return false;
            }
        }

        return true;


    
        


    }

    public static boolean bfs(int j,int color[],List<List<Integer>> adj)
    {
         Queue<Integer> q=new LinkedList<>();
        color[0]=0;
        q.add(j);   


        while(!q.isEmpty())
        {
            int node=q.peek();

            q.remove();
           
            for(int i=0;i<adj.get(node).size();i++)
            {
                if(color[adj.get(node).get(i)]==-1)
            {
                q.add(adj.get(node).get(i));
                color[adj.get(node).get(i)]=1-color[node];
            }
            else if(color[node]==color[adj.get(node).get(i)])
            {

                return false;
        

            }
            }


        }  


        return true;  
    }
}