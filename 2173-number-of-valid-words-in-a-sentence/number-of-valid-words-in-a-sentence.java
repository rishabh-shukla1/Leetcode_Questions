class Solution {
    public int countValidWords(String sentence) {

        String s[]=sentence.split(" ");
        int count=0;

        for(int i=0;i<s.length;i++)
        {
            if(valid(s[i]))
            {
                count++;
            }
        }


        return count;


        
    }public boolean valid(String s)
    {

        if(s.isEmpty())
        {
            return false;
        }

        int h=0;
        int p=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(Character.isDigit(ch))
            return false;

            if(ch=='-')
            {
                h++;
                if(h>1|| i==0 || i==s.length()-1 || !Character.isLowerCase(s.charAt(i-1)) || !Character.isLowerCase(s.charAt(i+1)))
                {
                    return false;
                }
            }

            if(ch=='.'||ch=='!'|| ch==',')
            {
             p++;
                if(i!=s.length()-1 || p>1 )
                return false;
            }

            
        }

        return true;

    }
}