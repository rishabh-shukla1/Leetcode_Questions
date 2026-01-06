class Solution {
    public int[] applyOperations(int[] nums) {


        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1]){
                continue;
            }
            else{
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        int l=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int t=nums[i];
                nums[i]=nums[l];
                nums[l]=t;
                l++;
            }

        }

        return nums;
        
    }
}