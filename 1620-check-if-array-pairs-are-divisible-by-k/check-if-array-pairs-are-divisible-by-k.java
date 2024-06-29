class Solution {
    public boolean canArrange(int[] a, int k) {

        int b[]=new int[k];

        for(int i=0;i<a.length;i++)
        {

            int n=a[i]%k;

            if(n<0) n=n+k;

            b[n]++;
        

        }

        if(b[0]%2!=0)  return false;

        for(int i=1;i<=k/2;i++)
        {
            if(b[i]!=b[k-i])  return false;
        }


     
        return true;
        
    }
}