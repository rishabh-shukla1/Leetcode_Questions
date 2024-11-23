class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        
          int m=g.length;
          int n=g[0].length;

         
          
        int dp[][]=new int[m+1][n+1];
        
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }


        return find(m-1,n-1,dp,g);
        
    }
    public static int find(int i,int j,int dp[][],int g[][])
    {

        
        if(i<0 || j<0)
        {
            return 0;
        }


          
        if(g[i][j]==1)
        {
           
            return 0;
        }

         
        if(i==0 && j==0)
        {
            return 1;
        }

       
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

    

        int up=find(i-1,j,dp,g);
        int left=find(i,j-1,dp,g);

        return dp[i][j]=up+left;
    }
}