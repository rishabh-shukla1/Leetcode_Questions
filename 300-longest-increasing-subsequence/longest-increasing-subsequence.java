class Solution {
    public int lengthOfLIS(int[] nums) {

     Integer dp[][]=new Integer[nums.length][nums.length+1];

     return find(nums,0,dp,-1);

        
    }

    public static int find(int n[],int i,Integer dp[][],int prev)
    {
        if(i>=n.length )
        {
            return 0;
        }

        if(dp[i][prev+1]!=null)
        {
            return dp[i][prev+1];
        }

        int nottake=find(n,i+1,dp,prev);

        int take=0;

        if(prev==-1 || n[i]>n[prev])
        {
        take=1+find(n,i+1,dp,i);
        }


        return dp[i][prev+1]=Math.max(take,nottake);
    }
}