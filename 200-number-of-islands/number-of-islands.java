class Solution {
    public int numIslands(char[][] grid) {


        int r=grid.length;
        int c=grid[0].length;
        int ans=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    check(grid,i,j);
                    ans++;
                }

            }
        }


        return ans;


        
    }

    public static void check(char grid[][],int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1')
        {
            return ;
        }
        grid[i][j]='2';
        check(grid,i,j-1);
        check(grid,i-1,j);
        check(grid,i,j+1);
        check(grid,i+1,j);


        



    }
}