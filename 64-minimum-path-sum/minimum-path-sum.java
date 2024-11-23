class Solution {
    public int minPathSum(int[][] grid) {

      int dp[][]=new int[grid.length][grid[0].length];
      
      for(int a[]: dp)
      {
        Arrays.fill(a,-1);
      }
        return find(grid.length-1 , grid[0].length-1,grid, dp);
        
    
    }

    public  static int find(int i, int j , int grid[][],int dp[][])
    {
        if(i==0 && j==0)
        {
            return grid[i][j];
        }

        if(i<0 || j<0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
         int up=find(i-1,j,grid,dp);
         int down=find(i,j-1,grid,dp);

         return dp[i][j]=Math.min(up,down)+grid[i][j];


    }

   
}