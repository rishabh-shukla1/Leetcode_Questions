class Solution {
    public int[] countBits(int n) {

        int a[]=new int[n+1];
        a[0]=0;
    
        for(int i=1;i<=n;i++)
        {

            int c=0;
            int k=i;
            while(k>0)
            {
                if(k%2==1)
                c++;

                k=k/2;
            }

            a[i]=c;
        }


        return a;

     
        
    }
}