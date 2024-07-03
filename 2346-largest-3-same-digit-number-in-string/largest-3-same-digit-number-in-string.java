class Solution {
    public String largestGoodInteger(String s) {


        int k=1;

        int ans=Integer.MIN_VALUE;

        String s1="";
        
        for(int i=0;i<=s.length()-3;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2) )
            {
                String w=s.substring(i,i+3);

                int t=Integer.parseInt(w);

                if(t>ans)
                {
                 ans=t;
                 s1=w;
                }

            }
            
        }

        if(ans==Integer.MIN_VALUE)
        return "";


        return s1;
            
        
    }
}