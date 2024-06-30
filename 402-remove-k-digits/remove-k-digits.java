class Solution {
    public String removeKdigits(String nums, int k) {

        if(nums.length()==k)
        return "0";


       Stack<Integer> s=new  Stack<>();

       for(int i=0;i<nums.length();i++)

       {

        int n=nums.charAt(i)-'0';

        while(!s.isEmpty() && s.peek()>n  && k>0)
        {
        s.pop();
        k--;
        }

        s.push(n);
       }


       while(k>0)
       {
        s.pop();
        k--;
       }

       StringBuilder a=new StringBuilder();

       while(!s.isEmpty())
       {
        a.insert(0,Integer.toString(s.pop()));
       }

       String b=a.toString();

       int i=0;
       while(i<b.length() && b.charAt(i)=='0')
       i++;

       b=b.substring(i,b.length());


       if(b=="")
       return "0";


       return b;






    }
}