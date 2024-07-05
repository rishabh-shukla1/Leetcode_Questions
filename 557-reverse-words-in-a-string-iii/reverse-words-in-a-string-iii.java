class Solution {
    public String reverseWords(String s) {
        
        String ans="";
        String w="";


        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {

                w=ch+w;
            }
            else
            {
                ans=ans+w+" ";
                w="";
            }
        }

        ans=ans+w;

        return  ans;
        
    }
}