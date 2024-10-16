class Solution {
    public int minCostClimbingStairs(int[] cost) {

       
        int dp[]=new int [cost.length+1];
        Arrays.fill(dp,-1);


         int zero=climb(cost,0,dp);
        int one=climb(cost,1,dp);

        return Math.min(zero,one);
        
    }

    public static int climb(int []a,int i,int dp[])
    {
        if(i>=a.length)
        {
           return 0;

        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }


          int one=climb(a,i+1,dp);
            int two=climb(a,i+2,dp);

            return  dp[i]=Math.min(one,two)+a[i];
    }
}