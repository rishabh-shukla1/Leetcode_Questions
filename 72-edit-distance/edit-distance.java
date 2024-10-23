class Solution {
    public int minDistance(String word1, String word2) {

          int dp[][]=new int[word1.length()+1][word2.length()+1];
          for(int i[]:dp)
          {
            Arrays.fill(i,-1);
          }
        return Min_Op(word1,word2,0,0,dp);
        
    }
    public  static int Min_Op(String s,String t,int i , int j,int[][]dp)
    {
        if(i==s.length())
        {
            return t.length()-j;
        }
        if(j==t.length())
        {
            return s.length()-i;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)== t.charAt(j))
        {
            ans=Min_Op(s,t,i+1,j+1,dp);
        }
        else
        {
            int d=Min_Op(s,t,i+1,j,dp);
            int r=Min_Op(s,t,i+1,j+1,dp);
            int y=Min_Op(s,t,i,j+1,dp);

            ans=Math.min(d,Math.min(r,y))+1;
        }

        return dp[i][j]=ans;

    }
}