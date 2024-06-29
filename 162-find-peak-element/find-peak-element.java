class Solution {
    public int findPeakElement(int[] nums) {


        int l=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>l)
            {
                l=nums[i];
                index=i;
            }
        }
        return index;

        
    }
}