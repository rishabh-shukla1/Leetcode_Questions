class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {

        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }

        int i=s1.length();
        int j=s2.length();
        String ans="";


        while(i>0 && j>0)
        {

            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans=s1.charAt(i-1)+ans;
                i--;
                j--;

            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ans=s1.charAt(i-1)+ans;
                i--;
            }
            else
            {
                
                ans=s2.charAt(j-1)+ans;
                j--;
                
            }


        }


        while(i>0)
        {
             ans=s1.charAt(i-1)+ans;
                i--;

        }

        while(j>0)
        {

             ans=s2.charAt(j-1)+ans;
                j--;

        }

        return ans;


        
    }
}