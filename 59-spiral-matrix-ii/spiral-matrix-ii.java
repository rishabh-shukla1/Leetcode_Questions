class Solution {
    public int[][] generateMatrix(int n) {

    
        int c=0;
        int t=n * n;

        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=n-1;
        int d=1;

        int a[][]=new int [n][n];

        while(c<t)
        {
            for(int i=minc;i<=maxc && c<t;i++)
            {
               a[minr][i]=d;
               d++;


                c++;
                

            }

            minr++;

            for(int i=minr;i<=maxr && c<t ;i++)
            {
                a[i][maxc]=d;
                d++;
                c++;
                
            }
            maxc--;

            for(int i=maxc; i>=minc  && c<t;i--)
            {
                a[maxr][i]=d;
                d++;
                c++;
            }
            maxr--;

            for(int i=maxr ;i>=minr   && c<t;i--)
            {
                a[i][minc]=d;
                d++;
                c++;

            }
            minc++;
        }


        return a;
        
    }
}