class Solution {
    public boolean closeStrings(String word1, String word2) {


        int a[]=new int [26];
        int b[]=new int[26];
        if(word1.length()!=word2.length())
        return false;

        for(int i=0;i<word1.length();i++)
        {
            int t=(int)word1.charAt(i);
            a[t-97]++;
        }
           for(int i=0;i<word2.length();i++)
        {
            int t=(int)word2.charAt(i);
            b[t-97]++;
        }
        
        

        for(int i=0;i<a.length;i++)
        {
           if((a[i]==0 && b[i]!=0) || (a[i]!=0 && b[i]==0))
           return false;

        }

        Arrays.sort(a);
        Arrays.sort(b);
       

       


        

        for(int i=0;i<a.length;i++)
        {
           if(a[i]!=b[i])
           {
            return false;
           }
        }

       


       return true;


        
        
    }
}