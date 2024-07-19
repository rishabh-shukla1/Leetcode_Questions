class Solution {
    public boolean backspaceCompare(String s, String t) {

        String w1="";
        String w2="";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                w1=w1+s.charAt(i);
            }
            else
            {
                if(w1.length()>0)
                {
                    w1=w1.substring(0,w1.length()-1);
                }
                else
                {
                    w2="";
                }
            }

        }

         for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                w2=w2+t.charAt(i);
            }
            else
            {
                if(w2.length()>0)
                {
                    w2=w2.substring(0,w2.length()-1);
                }
                else
                {
                    w2="";
                }
            }

        }

        if(w1.equals(w2))
        {
            return true;
        } 

        return false;       
    }
}