class Solution {
    public boolean predictTheWinner(int[] nums) {

        int n=nums.length;

       

        Integer  dp[][]=new Integer[n][n];


        return find(nums,0,n-1,dp)>=0;
        
    }

    public static int find(int a[], int s, int e, Integer dp[][])
    {

        if(s==e)
        {
            return a[s];
        }

        if(dp[s][e]!=null)
        {
            return dp[s][e];
        }

       


      int pickstart=a[s]-find(a,s+1,e,dp);

      int picklast=a[e]-find(a,s,e-1,dp);


      return dp[s][e]=Math.max(pickstart, picklast);

        



     

    }
}