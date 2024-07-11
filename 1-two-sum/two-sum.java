class Solution {
    public int[] twoSum(int[] nums, int target) {
                int c[]=new int[2];
                
        for(int i=0;i<nums.length;i++)
        {  
            for(int j=i+1;j<nums.length;j++)
            {
                int n=nums[i]+nums[j];
                if(n==target)
                {
                    
                    c[0]=i;
                    c[1]=j;
                    break;
                }


            }
        }
    return (c);
    
    }  
    
}