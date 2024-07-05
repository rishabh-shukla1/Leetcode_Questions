class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0)
        return true;

        String w="";
        char ch=s.charAt(0);
        int f=0;

        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==ch && f<s.length())
            {
                w=w+t.charAt(i);
                f++;

                if(f<s.length())
                ch=s.charAt(f);


            }

        }

        if(w.equals(s))
        return true;

        return false;
       
    }
}