class Solution {
    public int longestCycle(int[] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            adj.add(new ArrayList<>());
        }

        int indegre[]=new int[edges.length];
        
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != -1) {
                adj.get(i).add(edges[i]);
                indegre[edges[i]]++;
            }
        }


        Queue<Integer> q=new LinkedList<>();


        for(int i=0;i<indegre.length;i++)
        {
            if(indegre[i]==0)
            {
                q.add(i);
            }
        }


        while(!q.isEmpty())
        {
            int node=q.poll();

            for(int i=0;i<adj.get(node).size();i++)

            {

                indegre[adj.get(node).get(i)]--;

                if( indegre[adj.get(node).get(i)]==0)
                {
                    q.add(adj.get(node).get(i));
                }
            }

        }


        int ans=-1;


        int vis[]=new int[edges.length];

        for(int i=0;i<edges.length;i++)
        {
            if(indegre[i]>0 && vis[i]==0)
            {
                int count=0;

                int curr=i;


                while(vis[curr]==0)
                {
                    vis[curr]=1;

                    count++;

                    curr=edges[curr];
                }

                ans=Math.max(ans,count);
            }


          
        }


        return ans;







        
    }
}