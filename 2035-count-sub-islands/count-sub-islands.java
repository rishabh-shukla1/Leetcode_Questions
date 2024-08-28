class Solution {

 int ans=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int c=0;

        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==1)
                {
                    ans=1;
                    check(i,j,grid1,grid2);
                    c=c+ans;
                }
            }
        }

        return c;
        
    }

    public  void check(int i , int j, int [][]g1, int[][]g2)
    {

        if(i>=g2.length || j>=g2[0].length || i<0 || j<0 || g2[i][j] ==0)
        {
            return ;

        }

       if(g1[i][j]==0)ans=0;

       g2[i][j]=0;
       check(i-1,j,g1,g2);
       check(i+1,j,g1,g2);
       check(i,j+1,g1,g2);
       check(i,j-1,g1,g2);
    }
}