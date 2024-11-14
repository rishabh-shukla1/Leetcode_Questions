class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int ans=Integer.MAX_VALUE;
        Integer [][] dp=new Integer[matrix.length][matrix[0].length];

        for(int i=0;i<matrix[0].length;i++)
        {
            
            ans=Math.min(ans,Path_Sum(matrix,0,i,dp));
        }

        

        return ans;
    }
    public static int Path_Sum(int[][]grid , int cr, int cc,Integer dp[][])
    {
        
       
        if( cc>=grid[0].length || cc<0)
        {
            return Integer.MAX_VALUE;
        }

        if(cr==grid.length-1)
        {
            return grid[cr][cc];

        }
        if(dp[cr][cc]!=null)
        {
            return dp[cr][cc];
        }

       
        int ld= Path_Sum(grid,cr+1,cc-1,dp);
       
        int rd = Path_Sum(grid,cr+1,cc,dp);

         int d=Path_Sum(grid,cr+1,cc+1,dp);

        return dp[cr][cc]=Math.min(ld,Math.min(rd,d))+grid[cr][cc];
    }

        
        
    }
