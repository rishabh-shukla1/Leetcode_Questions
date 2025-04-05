class Solution {
    public boolean stoneGame(int[] piles) {
       int n=piles.length;
       Boolean dp[][][]=new Boolean[n][n][2];

        return find(piles, 0, piles.length-1,0,0,dp,1);
        
    }
    public static boolean find(int a[], int  s, int e,int alice, int bob,Boolean dp[][][], int  turn)
    {

        if(s>e)
        {
            return alice>bob;
        }

        if(dp[s][e][turn]!=null)
        {
            return dp[s][e][turn];
        }

       boolean as=false;
       boolean ae=false;
       boolean bs=false;
       boolean be=false;

       if(turn==1)
       {
        as=find(a,s+1,e,alice+a[s],bob,dp,0);
        ae=find(a,s,e-1,alice+a[e],bob,dp,0);
       }
       else
       {
        bs=find(a,s+1,e,alice,bob+a[s],dp,1);
        be=find(a,s,e-1,alice,bob+a[e],dp,1);
       }



       return dp[s][e][turn]=as|| ae || bs || be ;

    }
}