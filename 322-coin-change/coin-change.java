class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][]=new int[coins.length][amount+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }

        int result=find(coins.length-1,coins,amount,dp);

      return   result!=Integer.MAX_VALUE ? result:-1;
        
    }
    public  static int find(int i ,int a[],int target, int dp[][])
    {

        if(i==0)
        {
            if(target%a[i]==0)
            {
                return target/a[i];
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }

        if(dp[i][target]!=-1)
        {
            return dp[i][target];
        }

        int nottake=find(i-1,a,target,dp);

        int take=Integer.MAX_VALUE;

        if(target>=a[i])
        {
            int sub=find(i,a,target-a[i],dp);
           if(sub!=Integer.MAX_VALUE)
           {
            take=1+sub;
           }

        }

       return  dp[i][target]=Math.min(take,nottake);
        
    }
}