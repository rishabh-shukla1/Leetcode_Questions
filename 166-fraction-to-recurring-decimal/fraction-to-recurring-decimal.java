class Solution {
    public String fractionToDecimal(int n, int d) {


        StringBuilder s=new StringBuilder();

        if(n==0)
        return "0";

        s.append(n>0  ^  d>0  ?"-" : "");

        long num=Math.abs((long)n);
        long den=Math.abs((long)d);

        s.append(num/den);
        num=num%den;

        if(num==0)
        return s.toString();

        s.append(".");

        HashMap<Long,Integer> h=new HashMap<>();

        while(num!=0)
        {
            num=num*10;
            s.append(num/den);
            num=num%den;
            if(h.containsKey(num))
            {
                int index=h.get(num);
                s.insert(index,"(");
                s.append(")");
                break;
                 

            }
            else
            {
                h.put(num,s.length());
            }

            
        }

        return s.toString();


    

        
        
    }
}