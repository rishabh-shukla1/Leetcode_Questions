class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {

        int a[]=new int[10001];

        for(int i=0;i<banned.length;i++)
        {
            a[banned[i]]++;
        }

        int sum=0;

        int ans=0;

        for(int i=1;i<=n;i++)
        {

            if(a[i]==0 && i+sum<=maxSum )
            {
                ans++;
                sum=sum+i;
            }



        }

        return ans;


        
    }
}