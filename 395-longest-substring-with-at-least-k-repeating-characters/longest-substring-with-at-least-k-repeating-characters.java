class Solution {
    public int longestSubstring(String s, int k) {

         int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int a[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                int index=s.charAt(j)-'a';
                  a[index]++;


                 
                  if(a[index]>=k & check(a,k))
                  {
                    // System.out.println(s.substring(i,j+1));

                    String  d=s.substring(i,j+1);
                    if(d.length()>=ans)
                    ans=d.length();
                  }

            }
        }


        return ans;
        
    }


    public boolean check(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0 && a[i]<k)
            {
                return false;
            }
        }
        return true;
    }
}