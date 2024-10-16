class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[cost.length];
        Arrays.fill(dp,-1);
        find(cost,cost.length-1,dp);
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
    public int find(int []cost,int idx,int []dp){
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int one = find(cost,idx-1,dp);
        int zero = find(cost,idx-2,dp);
        return dp[idx] = Math.min(one,zero)+cost[idx];
    }
}