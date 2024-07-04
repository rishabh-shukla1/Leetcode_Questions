class Solution {
    public String convertToBase7(int nums) {

      int t=nums;
        if(nums==0)
        return "0";

        int n=Math.abs(nums);



        StringBuilder s=new StringBuilder();

        while(n>0)
        {
            int c=n%7;
            s.append(c);
            n=n/7;

        }

        s.reverse();

        String w=s.toString();

        if(t<0)
        {
            w="-"+w;
        }
        return w;

        



       
        
    }
}