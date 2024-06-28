//Approach - 1

class Solution {
    public int minFlips(String s) {

        int n=s.length();
        s=s+s;


        StringBuilder p1= new StringBuilder();
        StringBuilder p2=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            p1.append(i%2==0 ? '0':'1');
            p2.append(i%2==0 ? '1':'0');

        }
        int ans=Integer.MAX_VALUE;
        int m1=0;
        int m2=0;
        for(int i=0;i<s.length();i++)
        {
            if(p1.charAt(i)!=s.charAt(i))  m1++;
            if(p2.charAt(i)!=s.charAt(i))   m2++;

            if(i>=n)
            {
            if(p1.charAt(i-n)!=s.charAt(i-n))  m1--;
            if(p2.charAt(i-n)!=s.charAt(i-n))   m2--;
            }


            

            if(i>=n-1)
            ans=Math.min(ans,Math.min(m1,m2));

        }

      return ans;




   
    }
}