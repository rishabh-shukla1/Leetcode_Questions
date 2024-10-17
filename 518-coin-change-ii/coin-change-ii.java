class Solution {
    public int change(int amount, int[] coins) {

   int dp[][]=new int[coins.length][amount+1];
            for(int a[]:dp)
            {
                Arrays.fill(a,-1);
            }
         return  incexc(amount,coins,0,dp);
        
    }
    public static int incexc(int amount,int c[],int i,int dp[][])
    {
        if(amount==0)
        {
            return 1;
        }
        if(i==c.length)
        {
            return 0;
        }

        if(dp[i][amount]!=-1)
        {
            return dp[i][amount];
        }
        int inc=0;
        int exc=0;

        if(amount>=c[i])
        {
            inc=incexc(amount-c[i],c,i,dp);
        }

        exc=incexc(amount,c,i+1,dp);

        return  dp[i][amount]= inc+exc;
    }
}