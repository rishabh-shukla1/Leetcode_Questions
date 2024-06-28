class Solution {
    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        int c=0;
       int a=0;


        for(int i=0;i<nums.length;i++)
        {
            a=Math.max(a,nums[i]);

            c=c+(a++)-nums[i];
           
        }

        return c;
        
    }
}