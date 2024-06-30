class Solution {
    public int numTrees(int n) {

        int a[]=new int [n+1];

a[0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                a[i]+=a[j] * a[i-j-1];


            }

        }

        return a[n];
        
    }
}