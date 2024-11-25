class Solution {
    public int minFallingPathSum(int[][] matrix) {
     int min=Integer.MAX_VALUE;

        Integer dp[][]=new Integer[matrix.length+1][matrix[0].length+1];

        for(int i=0;i<matrix[0].length;i++)
        {

            min=Math.min(min,find(0,i,matrix,dp));

        }

        return min;
        
    }

    public static int find(int i, int j, int a[][],Integer[][]dp)
    {
        if(j<0 || j>=a[0].length)
        {
            return (int)Math.pow(10,9);
        }

        if(i==a.length-1)
        {
            return a[i][j];
            
        }
        if(dp[i][j]!=null)
        {
            return dp[i][j];
        }


        int min=(int)Math.pow(10,9);
        for(int next=0;next<a[0].length;next++)
        {
            if(next!=j)
            {
                min=Math.min(min,a[i][j]+find(i+1,next,a,dp));
            }
        }

       
        return dp[i][j]=min;
        
        
    }
}
