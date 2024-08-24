class Solution {
    public String nearestPalindromic(String n) {


        Long N=Long.parseLong(n);

        long s=previous(String.valueOf(N-1).toCharArray());

        long l=next(String.valueOf(N+1).toCharArray());


        return String.valueOf(l-N <N-s  ? l :s);





        
    }


    private long previous(char[]a)
    {

        for(int i=0;i<a.length/2;i++)
        {

            while(a[i]!=a[a.length-1-i])
            {
                dec(a,a.length-1-i);

                if(a[0]=='0') return Long.parseLong(new String(a));

            }
        }

        return Long.parseLong(new String(a));


    }

    private void dec(char[] a , int i)
    {
        while(a[i]=='0')
        {
            a[i--]='9';
        }

        a[i]--;
    }


     private long next(char[]a)
    {

        for(int i=0;i<a.length/2;i++)
        {

            while(a[i]!=a[a.length-1-i])
            {
                inc(a,a.length-1-i);

            }
        }

        return Long.parseLong(new String(a));


    }


     private void inc(char[] a , int i)
    {
        while(a[i]=='9')
        {
            a[i--]='0';
        }

        a[i]++;
    }
}