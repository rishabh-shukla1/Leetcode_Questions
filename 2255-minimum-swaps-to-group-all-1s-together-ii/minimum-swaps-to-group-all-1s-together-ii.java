class Solution {
    public int minSwaps(int[] nums) {

         int one=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            one++;
         }

         int ans=Integer.MAX_VALUE;

         int l=0;

         int n=nums.length;

         int c=0;


         for(int r=0;r<n+n;r++)
         {

            c=c+nums[r%n];

            if(r-l+1>one)
            {
                c=c-nums[l++ % n];
            }



            if(r-l+1 ==one)
            {
                ans=Math.min(ans,one-c);
            }

            



         }       

    return ans;
}
}