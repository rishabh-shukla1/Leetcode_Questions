class Solution {
    public int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);
        int ans=0;
        int m=nums[0];
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            int t=Math.abs(m-nums[i]);
            if(t<=k)
            {
                d++;
            
            }
            else
            {
                d=0;
                ans++;

                m=nums[i];
                d++;

               
            }


        }


        if(d>0)
        ans++;


        return ans;
        
    }
}