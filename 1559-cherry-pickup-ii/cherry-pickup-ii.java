class Solution {
    public int cherryPickup(int[][] grid) {

     Integer dp[][][]=new Integer[grid.length][grid.length][grid[0].length];
       return  find(grid,0,0,grid[0].length-1,dp);
        
    }

    public static int find(int a[][],int i,int j1,int j2,Integer dp[][][])
    {
        if(j1<0|| j1>=a[0].length || j2<0|| j2>=a[0].length)
        {
            return 0;
        }

        if(i==a.length-1)
        {
            if(j1==j2)
            {
                return a[i][j1];
            }
            else
            {
                return a[i][j1]+a[i][j2];
            }
        }

        if(dp[i][j1][j2]!=null)
        {
            return dp[i][j1][j2];
        }

        
       int max=Integer.MIN_VALUE;

        for(int di=-1;di<=1;di++)   // ek  bar ke alex ke lie 3 h bob ke lie
        {
            
           
              for(int dj=-1;dj<=1;dj++)
              {

                if(j1==j2)
                {
                    max=Math.max(max,a[i][j1]+find(a,i+1,di+j1,j2+dj,dp));

                   
                }
                else
                {
                    max=Math.max(max,a[i][j1]+a[i][j2]+find(a,i+1,di+j1,j2+dj,dp));

                }

              }



        }


        return dp[i][j1][j2]=max;
    }
}