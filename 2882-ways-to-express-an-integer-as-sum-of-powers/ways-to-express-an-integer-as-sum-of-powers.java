class Solution {
    public int numberOfWays(int n, int x) {

        int dp[][]=new int[n+1][n+1];

        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }


       return  find(n,1,dp,x);
        
    }
    public static int  find(int target, int i,int dp[][],int x)
    {
        if(target==0)
        {
            return 1;
        }
        
        if(i>target)
        {
            return 0;

        }
         int p=(int)Math.pow(i,x);
       

        if(dp[i][target]!=-1)
        {
            return dp[i][target];
        }
        int notpick=find(target,i+1,dp,x);

        int pick=0;



       

        if(p<=target)
        {
            pick=find(target-p,i+1,dp,x);
        }


         int mod=(int)(1e9+7);
        return dp[i][target]=(pick+notpick)%mod;


        
    }
}