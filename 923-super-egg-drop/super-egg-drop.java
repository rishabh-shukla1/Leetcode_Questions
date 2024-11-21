class Solution {
    public int superEggDrop(int k, int n) {

        int dp[][]=new int[n+1][k+1];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }

        return Egg(n,k,dp);
        
    }

    public static int Egg(int n,int e, int dp[][])
    {
        if(n==0 || n==1 || e==1)
        {
            return n;
        }
        if(dp[n][e]!=-1)
        {
            return dp[n][e];
        }
        int ans=Integer.MAX_VALUE;
        int lo=1;
        int h=n;
        while(lo<=h)
        {
            int mid=(lo+h)/2;
        
            int l=Egg(mid-1,e-1,dp);
            int r=Egg(n-mid,e,dp);

            int t=Math.max(l,r)+1;
            ans=Math.min(ans,t);

            if(l<r)
            {
                lo=mid+1;
            }
            else
            {
             h=mid-1;
            }

        }
        return dp[n][e]=ans;
    }
}