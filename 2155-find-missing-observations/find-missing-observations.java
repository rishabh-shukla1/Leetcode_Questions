class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int a[]=new int [n];
        int sum=0;


        for(int i=0;i<rolls.length;i++)
        {
                 sum=sum+rolls[i];
        }

        int v=mean*(n+rolls.length)-sum;

        if( v>n*6 ||v<n)
        {
            return new int [0];
        }

        int num=v/n;
        int rem=v%n;

        for(int i=0;i<rem;i++)
        {
            a[i]=num+1;
        }


        for(int i=rem;i<n;i++)
        {
            a[i]=num;
        }


        return a;



        
        
    }
}