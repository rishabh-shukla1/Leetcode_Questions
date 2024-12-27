class Solution {
    public int longestPalindromeSubseq(String s1) {

       String s2="";
       for(int i=0;i<s1.length();i++)
       {
        s2=s1.charAt(i)+s2;

       }

       int dp[][]=new int[s1.length()][s2.length()];
       for(int i[]:dp)
       {
        Arrays.fill(i,-1);
       }


       return find(dp,s1.length()-1,s2.length()-1,s1,s2);
        
    }

    public static int find(int dp[][],int i,int j,String s1, String s2)
    {
        if(i<0 || j<0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];

        }

        int ans=0;


        if(s1.charAt(i)==s2.charAt(j))
        {
            ans=1+find(dp,i-1,j-1,s1,s2);

        }

        else
        {
            int f1=find(dp,i-1,j,s1,s2);
            int f2=find(dp,i,j-1,s1,s2);

            ans=Math.max(f1,f2);
        }


        return dp[i][j]=ans;
    }
}