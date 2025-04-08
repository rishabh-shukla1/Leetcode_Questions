class Solution {
    public String longestPalindrome(String s) {


        String w="";

        for(int i=0;i<s.length();i++)
        {
            w=s.charAt(i)+w;
        }

        System.out.println(w);

       

      

        


        int dp[][]=new int[s.length()+1][w.length()+1];

             int ind=0;

             int max=0;



        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=w.length();j++)
            {

                if(s.charAt(i-1)==w.charAt(j-1))
                {
                dp[i][j]=dp[i-1][j-1]+1;


                int  reverseindex=s.length()-j;

                if(reverseindex==i-dp[i][j])
                {
                    if (dp[i][j] > max) {
                            max = dp[i][j];
                            ind = i;
                        }
                }
                }

                

            }
        }
         String ans="";
        ans=s.substring(ind-max,ind);

        


        


        return ans;
        
    }
}