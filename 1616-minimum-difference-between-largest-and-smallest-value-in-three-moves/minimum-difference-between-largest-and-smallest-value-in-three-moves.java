class Solution {
    public int minDifference(int[] nums) {


        Arrays.sort(nums);



        int n=nums.length;

        if(n<=4)
        return 0;


        int t=Math.min(Math.min(nums[n-1]-nums[3],nums[n-2]-nums[2]),Math.min(nums[n-3]-nums[1],nums[n-4]-nums[0]));


        return t;




        
        
    }
}