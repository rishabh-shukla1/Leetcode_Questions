class Solution {
    public int maxPower(String s) {
           char ch=s.charAt(0);
           int k=1;
           int d=1;
        for(int i=1;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            k++;

            else
            {
                if(k>d)
                d=k;
                k=1;
                ch=s.charAt(i);

            }
            
        }
         if(k>d)
                d=k;

        return d;
        
    }
}