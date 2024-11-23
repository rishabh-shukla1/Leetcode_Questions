class Solution {
    public int climbStairs(int n) {
        
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }

    public static int climb(int n,int []dp)
    {
        if(n==0) return 1; 

        if(n<0) return 0; 

        if(dp[n]!=-1)
        {
            return dp[n];
        }


        int left=climb(n-1,dp);
        int right=climb(n-2,dp);

        return dp[n]=left+right;
    }
}