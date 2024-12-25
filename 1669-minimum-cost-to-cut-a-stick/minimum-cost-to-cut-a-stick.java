class Solution {
    public int minCost(int n, int[] cuts) {



        int t[]=new int[cuts.length+2];

        for(int i=0;i<cuts.length;i++)
        {
            t[i+1]=cuts[i];

        }
       

        t[t.length-1]=n;

         Arrays.sort(t);

        int dp[][]=new int[t.length+1][t.length+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }


        return find(1,cuts.length,t,dp);
        
    }

    public static int find(int i , int j , int t[],int dp[][])
    {
        if(i>j)
        {
            return 0;
           
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }


        int min=Integer.MAX_VALUE;


        for(int ind=i;ind<=j;ind++)
        {

            int cost=t[j+1]-t[i-1]+find(i,ind-1,t,dp)+find(ind+1,j,t,dp);

            min=Math.min(cost,min);


        }


        

        return dp[i][j]=min;
    }
}