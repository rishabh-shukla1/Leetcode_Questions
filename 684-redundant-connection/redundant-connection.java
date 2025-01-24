class Solution {
    public int[] findRedundantConnection(int[][] edges) {

     List<List<Integer>>adj=new ArrayList<>();

     int arr[]=new int[2];

     for(int i=0;i<=edges.length;i++)
     {
         adj.add(new ArrayList<>());
     }
    

     
     for(int i=0;i<edges.length;i++)
     {

        int  t1=edges[i][0];
        int t2=edges[i][1];



int vis[]=new int[edges.length+1];

        


            if(dfs(t1,t2,vis,adj))
            {

                arr[0]=t1;
                arr[1]=t2;

                return arr;
                




            }


        adj.get(t1).add(t2);
        adj.get(t2).add(t1);
        }


       



     
       return new int[0];
    }
        
    

    public static boolean dfs(int i, int parent,int vis[],List<List<Integer>>adj)
    {

        if(i==parent) return true;
        
        vis[i]=1;

        for(int j=0;j<adj.get(i).size();j++)
        {

            if(vis[adj.get(i).get(j)]==0)
            {
                if(dfs(adj.get(i).get(j),parent,vis,adj))
                {
                    return true;
                }
            }


           

        }


        return false;


    }
}