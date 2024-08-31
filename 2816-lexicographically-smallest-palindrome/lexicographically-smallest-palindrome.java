class Solution {
    public String makeSmallestPalindrome(String s) {

        char ch[]=s.toCharArray();


        for(int i=0;i<ch.length/2;i++)
        {
            if(ch[i]!=ch[ch.length-1-i])
            {
                char ch1=ch[i];
                char ch2=ch[ch.length-1-i];

                int t1=(int )ch1;
                int t2=(int)ch2;
                if(t1>t2)
                {
                   
                  

                       ch[i]=ch[ch.length-1-i];
                    
                    
                    
                }
                else
                {

                  ch[ch.length-1-i]=ch[i];
        
                    

                }
            }

        }


        return String.valueOf(ch);
        
    }
}