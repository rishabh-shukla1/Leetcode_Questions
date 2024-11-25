class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int min=Integer.MAX_VALUE;

        Integer dp[][]=new Integer[matrix.length][matrix[0].length];

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

        int  down=a[i][j]+find(i+1,j,a,dp);
        int  rd=a[i][j]+find(i+1,j+1,a,dp);
        int  ld=a[i][j]+find(i+1,j-1,a,dp);

        return dp[i][j]=Math.min(down,Math.min(rd,ld));
        
        
    }
}