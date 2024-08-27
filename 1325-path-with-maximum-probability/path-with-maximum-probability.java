class Solution {
    public double maxProbability(int n, int[][] edge, double[] succProb, int start_node, int end_node) {


        double[]mp=new double[n];

        mp[start_node]=1.0;




        for(int i=0;i<=n-1;i++)
        {
            boolean update=false;
            for(int j=0;j<edge.length;j++)
            {

                int a=edge[j][0];
                int b=edge[j][1];


                double p=succProb[j];


                if(mp[a]*p >mp[b])
                {
                    mp[b]=mp[a]*p;
                    update=true;
                }


                 if(mp[b]*p >mp[a])
                {
                    mp[a]=mp[b]*p;
                    update=true;
                }


              


            }


              if(!update)
                {
                    break;
                }



        }

        for(int i=0;i<mp.length;i++)
        {
            System.out.println(mp[i]);
        }

        return mp[end_node];
        
    }
}