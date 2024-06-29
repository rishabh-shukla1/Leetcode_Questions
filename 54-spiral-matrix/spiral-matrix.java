class Solution {
    public List<Integer> spiralOrder(int[][] a) {

         List<Integer> l=new ArrayList<>();

        int c=0;
        int t=a.length * a[0].length;

        int minr=0;
        int minc=0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;

        while(c<t)
        {
            for(int i=minc;i<=maxc && c<t;i++)
            {
                l.add(a[minr][i]);

                c++;
                

            }

            minr++;

            for(int i=minr;i<=maxr && c<t ;i++)
            {
                l.add(a[i][maxc]);
                c++;
                
            }
            maxc--;

            for(int i=maxc; i>=minc  && c<t;i--)
            {
                l.add(a[maxr][i]);
                c++;
            }
            maxr--;

            for(int i=maxr ;i>=minr   && c<t;i--)
            {
                l.add(a[i][minc]);
                c++;

            }
            minc++;
        }


        return l;
        
    }
}