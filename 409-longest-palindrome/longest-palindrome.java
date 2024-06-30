class Solution {
    public int longestPalindrome(String s) {

       

        int a[]=new int[123];
        for(int i=0;i<s.length();i++)
        {
            int y=(int)s.charAt(i);
            a[y]++;


            
        }

        int sum=0;
        int c=0;
        int one=0;

        for(int i=0;i<a.length;i++)
        {
           
            if(a[i]>1)
            {
                sum=sum+((a[i]/2)*2);
            }
             if(a[i]%2==1 )
            {
               one=1;


            }
          
        }

        return sum+one;
        
    }
}