class Solution {
    public int countPrimes(int n) {

        boolean m[]=new boolean[n];
        if(n<2)
        {
            return 0;
        }

      int c=  prime(m,n);
        

       return c;

    }
    public static int prime(boolean []m,int n )
    {
        m[0]=true;
        m[1]=true;
        
        for(int i=2;i*i<m.length;i++)
        {
            for(int j=2;i*j<m.length;j++)
            {
                m[i*j]=true;
            }
        }
                int c=0;
        for(int i=2;i<m.length;i++)
        {
            if(m[i]==false)
            c++;
        }
        return c;

    }
   
}