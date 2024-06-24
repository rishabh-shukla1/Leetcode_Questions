class Solution {
    public boolean isIdealPermutation(int[] nums) {

      
        for(int i=0;i<nums.length;i++)
        {
            int t=Math.abs(nums[i]-i);
            if(t>1)
            return false;

        }

        return true;

     
             
    }
}