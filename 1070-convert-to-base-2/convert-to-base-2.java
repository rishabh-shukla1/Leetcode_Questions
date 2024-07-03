class Solution {
    public String baseNeg2(int n) {


        
        

        StringBuilder s=new StringBuilder();

        if(n==0)
        return "0";

        while(n!=0)
        {
            int t=n%-2;

            n=n/-2;

            if(t<0)
            {
                t-=-2;
                n++;
            }

            s.append(t);


        }

        return s.reverse().toString();

        



        
    }
}