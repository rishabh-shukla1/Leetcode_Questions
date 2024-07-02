class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        if(image[sr][sc]!=color)
        {
            int t=image[sr][sc];

            check(image,sr,sc,color,t);

        }



        return image;



        
    }

     public static void check(int  grid[][],int i,int j,int color,int t)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=t)
        {
            return ;
        }
        grid[i][j]=color;
        check(grid,i,j-1,color,t);
        check(grid,i-1,j,color,t);
        check(grid,i,j+1,color,t);
        check(grid,i+1,j,color,t);


        



    }
}
