class Solution {
    public int paintWalls(int[] cost, int[] time) {

        int dp[][]=new int[cost.length+1][cost.length+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }



        return find(cost.length-1,cost.length, cost,time,dp);
       
    }

    public static int find(int i,int tar, int c[], int t[],int dp[][])
    {

        if(tar<=0)
        {
            return 0;
        }

        if(i<0)
        {
            return (int)1e9;
        }

        if(dp[i][tar]!=-1)
        {
            return dp[i][tar];
        }

        int not=find(i-1,tar,c,t,dp);

        int paint=(int)1e9;

        if(tar>0)
        {
            paint=c[i]+find(i-1,tar-1-t[i],c,t,dp);
        }


        return dp[i][tar]=Math.min(not,paint);

    }
}