class Solution {
    public int maxProfit(int[] prices) {



    Integer dp[][][]=new Integer[prices.length][2][3];






      return find(prices,1,2,0,dp);
        
    }

    public static int find(int p[],int buy,int cap,int i,Integer dp[][][])
    {
        if(cap==0)
        {
            return 0;
        }
        if(i==p.length)
        {
            return 0;
        }
        if(dp[i][buy][cap]!=null)
        {
            return dp[i][buy][cap];
        }
        


        int profit=0;
        if(buy==1)
        {

            profit=Math.max(-p[i]+find(p,0,cap,i+1,dp),0+find(p,1,cap,i+1,dp));
        
            
        }
        else
        {
            profit=Math.max(p[i]+find(p,1,cap-1,i+1,dp),0+find(p,0,cap,i+1,dp));

        }


        return dp[i][buy][cap]=profit;
    }
}