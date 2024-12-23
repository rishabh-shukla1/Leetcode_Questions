class Solution {
    public int lastStoneWeightII(int[] arr) {


        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];

        }

        boolean dp[][]=new boolean[arr.length][sum+1];

        for(int i=0;i<arr.length;i++)
        {
            dp[i][0]=true;
           
        }
        if(arr[0]<=sum)
        {
            dp[0][arr[0]]=true;

        }

        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                
                boolean nottake=dp[i-1][j];
                 boolean take=false;

                 if(arr[i]<=j)
                 {
                    take=dp[i-1][j-arr[i]];
                 }

                 dp[i][j]= take| nottake;
            }
        }

        int min=Integer.MAX_VALUE;


        for(int i=0;i<=sum;i++)
        {
            if(dp[arr.length-1][i]==true)
            {
                int s1=i;
                int s2=sum-i;
                min=Math.min(min,Math.abs(s1-s2));


            }
        }

        return min;

        
    }
}