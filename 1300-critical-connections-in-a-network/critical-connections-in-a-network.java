class Solution {

    private int time=0;

    public void dfs(int node,int parent, int vis[],int tim[],int low[],List<List<Integer>> b,List<List<Integer>>adj)
    {

        vis[node]=1;
        tim[node]=low[node]=time;
        time++;

        for(int i=0;i<adj.get(node).size();i++)
        {
            if(adj.get(node).get(i)==parent) continue;

            if(vis[adj.get(node).get(i)]==0)
            {
                dfs(adj.get(node).get(i),node,vis,tim,low,b,adj);
                
                low[node]=Math.min( low[adj.get(node).get(i)],low[node]);


                if(low[adj.get(node).get(i)]>tim[node])
                {
                
                    
                   
                    b.add( Arrays.asList(node,adj.get(node).get(i)));}

            }

            else
            {

                  low[node]=Math.min( low[adj.get(node).get(i)],low[node]);

            }

        }

    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> c) {


        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }



        for(List<Integer>l:c)
        {
           
                int u=l.get(0);
                int v=l.get(1);
                adj.get(u).add(v);
                adj.get(v).add(u);
            
        }
        

        int vis[]=new int[n];
        int tim[]=new int[n];
        int low[]=new int[n];

        List<List<Integer>> b=new ArrayList<>();

        dfs(0,-1,vis,tim,low,b,adj);
        return b;


        
    }
}