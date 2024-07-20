class Solution {
    public int[][] restoreMatrix(int[] r, int[] c) {


            int a[][]=new int[r.length][c.length];
        for(int i=0;i<r.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                a[i][j]=Math.min(r[i],c[j]);
                r[i]=r[i]-a[i][j];
                c[j]=c[j]-a[i][j];


            }
        }


        return a;
        
    }
}