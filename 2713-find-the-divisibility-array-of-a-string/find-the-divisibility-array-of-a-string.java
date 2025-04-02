class Solution {
    public int[] divisibilityArray(String s, int m) {

        int a[]=new int[s.length()];
    long t=0;
        for(int i=0;i<s.length();i++)
        {
            long y=(long)(s.charAt(i)-'0');

             t=((t*10)+y)%m;

            if(t % m==0 )
            {
                a[i]=1;
            }
            else
            {
                a[i]=0;
            }
            
        }


        return a;
        
    }
}