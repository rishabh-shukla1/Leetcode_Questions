class Solution {
    public int rob(int[] nums) {

        int dp[]=new int[nums.length+1];
       Arrays.fill(dp,-1);

        return rober(nums,dp,0);
        
    }

    public static int rober(int n[],int dp[],int i)
    {
        if(i>=n.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int rob=n[i]+rober(n,dp,i+2);
        int dont_rob=rober(n,dp,i+1);

        return dp[i]=Math.max(rob,dont_rob);
    }
}