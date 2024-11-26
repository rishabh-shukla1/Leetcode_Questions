class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
       

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum%2!=0)
        {
            return false;
        }

         Integer dp[][]=new Integer[nums.length+1][(sum/2)+1];

        return find(sum/2,nums,nums.length-1,dp)==1;
    }

    public static int find(int target,int a[],int i,Integer dp[][])
    {
        if(target==0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i][target]!=null)
        {
            return dp[i][target];
        }

        int nottake=find(target,a,i-1,dp);

        int take=0;
        if(target>=a[i])
        {
            take=find(target-a[i],a,i-1,dp);
        }


        return dp[i][target]=take|nottake;



    }
}