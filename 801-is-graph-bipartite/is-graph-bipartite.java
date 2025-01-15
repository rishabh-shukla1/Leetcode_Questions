class Solution {

    class BipartitePair{

        int vtx;
        int dis;

        public BipartitePair(int vtx,int dis){

            this.dis=dis;
            this.vtx=vtx;
        }
    }
    public boolean isBipartite(int[][] graph) {

        Queue<BipartitePair> q=new LinkedList<>();

        HashMap<Integer,Integer> visited=new HashMap<>();

        for(int vtx=0;vtx<graph.length;vtx++)
        {
            if(visited.containsKey(vtx))
            {
                continue;
            }
            q.add(new BipartitePair(vtx,0));

            while(!q.isEmpty())
            {
                //remove

                BipartitePair rp=q.poll();

                //ignore

                if(visited.containsKey(rp.vtx))
                {

                    if(visited.get(rp.vtx)!=rp.dis)
                    {

                        return false;
                    }
                    continue;
                }

                //add visited

                visited.put(rp.vtx,rp.dis);

                //add unvisited nbrs
                for(int nbrs:graph[rp.vtx])
                {
                    if(!visited.containsKey(nbrs))
                    {
                        q.add(new BipartitePair(nbrs, rp.dis+1));
                       
                    }
                }

                
            }
        }

        return true;
        
    }
}