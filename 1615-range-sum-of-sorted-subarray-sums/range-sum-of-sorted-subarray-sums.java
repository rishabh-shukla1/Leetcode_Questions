class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {


        int a[]=new int[(n*(n+1))/2];
        int t=0;

        for(int i=0;i<nums.length;i++)
        {
            int f=nums[i];
            a[t++]=f;

            for(int j=i+1;j<nums.length;j++)
            {
                f=f+nums[j];
                a[t++]=f;
            }
            
        }

        Arrays.sort(a);


        long ans=0;

        for(int i=left-1;i<right;i++)
        {

            ans=(ans+a[i])%1000000007;

        }



        return (int)ans;
        
    }
}