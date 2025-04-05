class Solution {
    public int minCut(String s) {


        int dp[][]=new int[s.length()][s.length()];
        
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        
        
        return find(s,0,s.length()-1,dp);
        
    }

     public static int find(String s, int i, int j, int dp[][])
    {
        
        if(i>=j ||check(s,i,j) )
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++)
        {
            
            if(check(s,i,k))
            {
                
                int count=1+find(s,k+1,j,dp);
                
                min=Math.min(min,count);
            }
            
        }
        
        return dp[i][j]=min;
        
    }
    
    public static boolean check(String s, int i, int j)
    {
        
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            
            i++;
            j--;
            
        }
        
        return true;
    }
}