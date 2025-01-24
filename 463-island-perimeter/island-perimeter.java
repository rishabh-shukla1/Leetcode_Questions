class Solution {
    static int t;
    public int islandPerimeter(int[][] grid) {

        t=0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    find(i,j,grid);
                    break;
                }
            }
        }

        return t;
        
    }

     public static void find(int i,int j , int a[][])
    {

         if(i<0 || j<0 ||i>=a.length || j>=a[0].length|| a[i][j]==0)
        {
            t++;
            return ;
        }

         if(a[i][j]==-1)
         {
            return ;
         }

        

        a[i][j]=-1;

        find(i+1,j,a);
        find(i-1,j,a);
        find(i,j+1,a);
        find(i,j-1,a);


    }

}