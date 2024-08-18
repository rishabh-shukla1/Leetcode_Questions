class Solution {
    public int nthUglyNumber(int n) {

        int u[]=new int [n];

        u[0]=1;

        int f1=2,f2=3,f3=5;
        int i1=0,i2=0,i3=0;

        for(int i=1;i<n;i++)
        {
            int d=Math.min(f1,Math.min(f2,f3));
            u[i]=d;
            if(f1==d)
            {
                f1=2*u[++i1];
            }
             if(f2==d)
            {
                f2=3*u[++i2];
            }
             if(f3==d)
            {
                f3=5*u[++i3];
            }
        }

        return u[u.length-1];
    


        
    }
}