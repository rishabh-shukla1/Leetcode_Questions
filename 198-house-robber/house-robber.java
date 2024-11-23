class Solution {
    public int rob(int[] nums) {

        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);

      return   find(nums,nums.length-1,dp);

        
    }

    public static int find(int []a, int i , int []dp)
    {
        if(i==0) return  a[i];

        if(i<0) return 0;
        
        if(dp[i]!=-1)
        {
            return dp[i];
        }

        int pick=a[i]+find(a,i-2,dp);
        int notpick=find(a,i-1,dp);

        return dp[i]=Math.max(pick ,notpick);
    }
}