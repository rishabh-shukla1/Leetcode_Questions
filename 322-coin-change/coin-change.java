class Solution {
    public int coinChange(int[] coins, int amount) {
          

    int dp[][]=new int[coins.length+1][amount+1];

     for(int a[]:dp)
     {
        Arrays.fill(a,-1);
     }

      int t=find(coins,amount,coins.length-1,dp);

       return  t==Integer.MAX_VALUE?-1:t;




        
    }

    public static int find(int coins[],int target,int i,int dp[][])

    {

        if(i==0)
        {
            if(target%coins[i]==0)
            {
                return target/coins[i];
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }


        int nottake=find(coins,target,i-1,dp);

        int take=Integer.MAX_VALUE;


        if(dp[i][target]!=-1)
        {
            return dp[i][target];
        }

        if(target>=coins[i])
        {

            int sub=find(coins,target-coins[i],i,dp);

            if(sub!=Integer.MAX_VALUE)
            {
                take=1+sub;
            }
        }


        return dp[i][target]=Math.min(take,nottake);

    }
}