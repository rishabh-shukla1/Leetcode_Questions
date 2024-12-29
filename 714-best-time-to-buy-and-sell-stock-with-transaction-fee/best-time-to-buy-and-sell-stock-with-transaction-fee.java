class Solution {
    public int maxProfit(int[] prices, int fee) {
   
        
  
    Integer dp[][]=new Integer[prices.length][2];






      return find(prices,1,0,dp,fee);
        
    }

    public static int find(int p[],int buy,int i,Integer dp[][],int fee)
    {
      
        if(i>=p.length)
        {
            return 0;
        }
        if(dp[i][buy]!=null)
        {
            return dp[i][buy];
        }
        


        int profit=0;
        if(buy==1)
        {

            profit=Math.max(-p[i]+find(p,0,i+1,dp,fee),0+find(p,1,i+1,dp,fee));
        
            
        }
        else
        {
            profit=Math.max((p[i]-fee)+find(p,1,i+1,dp,fee),0+find(p,0,i+1,dp,fee));

        }


        return dp[i][buy]=profit;
    }
}
