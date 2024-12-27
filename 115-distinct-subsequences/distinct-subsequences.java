class Solution {
    public int numDistinct(String s, String t) {


       int  dp[][]=new int[s.length()][t.length()];

  for(int i[]:dp)
  {
    Arrays.fill(i,-1);
  }

       return find(dp,s.length()-1,t.length()-1,s,t);
        
    }

    public static int find(int dp[][],int i, int j, String s ,String t)
    {

         if(j<0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
       

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
    

        if(s.charAt(i)==t.charAt(j))
        {
            return dp[i][j]=find(dp,i-1,j-1,s,t)+find(dp,i-1,j,s,t);


        }
        else
        {
          return dp[i][j]=find(dp,i-1,j,s,t);
        }

    
    }
}