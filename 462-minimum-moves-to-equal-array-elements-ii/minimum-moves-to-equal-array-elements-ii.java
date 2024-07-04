class Solution {
    public int minMoves2(int[] nums) {


        Arrays.sort(nums);

        int t=nums[nums.length/2];
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            int f=Math.abs(t-nums[i]);
            ans=ans+f;

        }

        return ans;


        
        
    }
}