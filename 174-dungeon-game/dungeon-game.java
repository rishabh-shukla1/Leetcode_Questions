class Solution {
    public int calculateMinimumHP(int[][] dungeon) {

       int m=dungeon.length;
       int n=dungeon[0].length;

        int dp[][]=new int [m][n];
        for(int a[]:dp)
        Arrays.fill(a,-1);

      return   find(dungeon,m-1,n-1,0,0,dp);
        




        
    }

      public static int find(int a[][],int m,int n, int i, int j ,int dp[][])
    {
        
        if(i>m || j>n)
        {
            return Integer.MAX_VALUE;
        }
        if(i==m && j==n)
        {
            return Math.max(1,1-a[i][j]);
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        int right=find(a,m,n,i+1,j,dp);
        int down=find(a,m,n,i,j+1,dp);
        
       
        
        return dp[i][j]=Math.max(1,Math.min(right,down)-a[i][j]);
    }

}