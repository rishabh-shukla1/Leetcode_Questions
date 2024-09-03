class Solution {
    public int getLucky(String s, int k) {

          String w="";
        for(int i=0;i<s.length();i++)
        {

            int t=s.charAt(i)-'a'+1;

            String w1=Integer.toString(t);


            w=w+w1;


        }

        System.out.println(w);

            int ans=0;
        while(k>0)
        {
            ans=0;
            for(int i=0;i<w.length();i++)
            {
                ans=ans+(w.charAt(i)-'0');
            }

            w=Integer.toString(ans);
            

            k--;
        }


        return ans;


        
        
    }
}