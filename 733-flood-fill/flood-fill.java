class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

            int target=image[sr][sc];


            if(target==color)
            {
                return image;
            }

        find(sr,sc,color,image,target);



        return image;
        
    }

    public static void find(int i,int j, int color,int a[][],int target)
    {

        if(i<0 || j<0 ||i>=a.length || j>=a[0].length|| a[i][j]!=target)
        {
            return ;
        }
        a[i][j]=color;

        find(i+1,j,color,a,target);
        find(i-1,j,color,a,target);
        find(i,j+1,color,a,target);
        find(i,j-1,color,a,target);
    }
}