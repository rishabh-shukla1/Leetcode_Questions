class Pair{

    int first;
    int second;

    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}


class Solution {


    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<List<Integer>>> adj=new ArrayList<>();

        PriorityQueue<Pair> q=new PriorityQueue<>((x,y)->x.second-y.second);

        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }

        int dis[]=new int[n+1];

       

        Arrays.fill(dis,Integer.MAX_VALUE);

         dis[k]=0;

        for (int i = 0; i < times.length; i++) {
            int source = times[i][0];
            int destination = times[i][1];
            int weight = times[i][2];
            adj.get(source).add(Arrays.asList(destination, weight));
        }

        q.add(new Pair(0,k));

        while(!q.isEmpty())
        {

            int node=q.peek().second;
            int  weight=q.peek().first;

            q.remove();

            for(int i=0;i<adj.get(node).size();i++)
            {

                int nextNode=adj.get(node).get(i).get(0);
                int nextWeight=adj.get(node).get(i).get(1);
                if(nextWeight+weight <dis[nextNode])
                {

                    dis[nextNode]=nextWeight+weight ;

                    q.add(new Pair(nextWeight+weight,nextNode ));
                }

            }



        }


      int max=0;
        for(int i=1;i<dis.length;i++)
        {

            // System.out.println(dis[i]);
            if(dis[i]==Integer.MAX_VALUE)
            {
                return -1;
            }

            max=Math.max(dis[i],max);
        }


        return max;










        
    }
}