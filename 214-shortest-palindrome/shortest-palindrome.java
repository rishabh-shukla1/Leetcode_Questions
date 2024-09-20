class Solution {
    public String shortestPalindrome(String s) {

        if(check(s))
        return s;

        int r=s.length()-1;


        while(r>0)
        {
            String w=s.substring(0,r);
           if(check(w))
           {
            break;
           }
           r--;
        }


        System.out.print(r);


        StringBuilder str=new StringBuilder();
        str.append(s.substring(r));

        str.reverse();;

        return str+s;

}

    public boolean check(String s)
    {
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }

        return true;



    }
}