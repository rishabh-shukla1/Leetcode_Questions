class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        int a[]=new int[k];
        a[0]=1;
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum=(sum+nums[i])%k;

            if(sum<0) sum=sum+k;

            ans=ans+a[sum];

            a[sum]++;


        }

        return ans;
        
    }
}