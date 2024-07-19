class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();


    String w="";
    String w1="";

    for(int i=0;i<s.length();i++)
    {
        int y=(int)s.charAt(i);
        char ch =s.charAt(i);
        if((y>=97 && y<=122)|| (y>=48 && y<=57)  )
        {
            w=w+ch;
            w1=ch+w1;
        }

        

        
    }
    System.out.println(w1+"  "+w);
    if(w1.equals(w))
    {
        return true;
    }
    return false;

    

    
        
    }
}