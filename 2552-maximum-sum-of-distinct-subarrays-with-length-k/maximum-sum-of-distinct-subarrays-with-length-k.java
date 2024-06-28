class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

         int i=0;
         int j=0;
        HashMap<Integer,Integer> m=new HashMap<>();

          long sum=0;
        long max=0;
        while(j<nums.length)
        {
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            sum=sum+nums[j];
            if(j-i+1==k)
            {
                if(m.size()==k)
                {
                    max=Math.max(max,sum);
                }

                sum=sum-nums[i];
               
                m.put(nums[i],m.get(nums[i])-1);
                if(m.get(nums[i])==0)
                {
                    m.remove(nums[i]);
                }
                i++;
            }

            
            j++;
        }

       

        return max;



        
      

        
    }
}