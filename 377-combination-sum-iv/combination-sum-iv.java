class Solution {
    public int combinationSum4(int[] nums, int target) {

        int dp[]=new int[target+1];

        Arrays.fill(dp,-1);
        dp[0]=1;

        return find(nums,target,dp);
    }

    public static int find(int nums[],int target,int dp[])
    {

        if(dp[target]!=-1)
        {
            return dp[target];
        }

        int count=0;
        
        for(int num:nums)
        {
            if(num<=target)
            count=count+find(nums,target-num,dp);

        }


        dp[target]=count;

        return dp[target];


        



     }
}