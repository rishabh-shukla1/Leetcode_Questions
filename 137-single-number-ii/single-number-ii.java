class Solution {
    public int singleNumber(int[] nums) {


        Arrays.sort(nums);
        int t=1;
        int k=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(k==nums[i])
            {
                t++;
            }
            else
            {
                if(t==1)
                {
                    return k;
                }
                k=nums[i];
                t=1;
            }


        }
        if(t==1)
        return nums[nums.length-1];
        return -1;
        
    }
}