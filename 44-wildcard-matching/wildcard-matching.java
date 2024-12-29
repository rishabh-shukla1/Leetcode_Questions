class Solution {
    public boolean isMatch(String s, String p) {


        int dp[][]=new int[p.length()][s.length()];

        for(int i[]:dp)
        {
            Arrays.fill(i,-1);

        }

       return find(p.length()-1,s.length()-1,p,s,dp)==1;

        
        
    }
    public static int find(int i, int j , String s, String p, int dp[][])
    {

        if(i<0  && j<0)
        {
            return 1;
        }

        if(i<0 && j>=0) return 0;

        if(j<0 && i>=0)
        {
            for(int k=0;k<=i;k++)
            {
                if(s.charAt(k)!='*')
                {
                    return 0;
                }

                
            }
            return 1;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }


        if(s.charAt(i)==p.charAt(j) || s.charAt(i)=='?')
        {
            return dp[i][j]=find(i-1,j-1,s,p,dp);
        }
        if(s.charAt(i)=='*')
        {
            return  dp[i][j]=find(i-1,j,s,p,dp)| find(i,j-1,s,p,dp);
        }


        return dp[i][j]=0;

    }
}