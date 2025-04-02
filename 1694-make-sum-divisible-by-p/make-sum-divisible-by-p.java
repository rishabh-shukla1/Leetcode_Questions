class Solution {
    public int minSubarray(int[] nums, int p) {

        int total=0;

        for(int i:nums)
        {
            total=(total+i)%p;
        }


        if(total%p==0)
        {
            return 0;
        }


        int remainder=total%p;


        HashMap<Integer,Integer> h=new HashMap<>();

        int min=nums.length;
        int prefix=0;

        h.put(0,-1);

        for(int i=0;i<nums.length;i++)
        {
            prefix=(prefix+nums[i])%p;

            int tar=(prefix-remainder+p)%p;


            if(h.containsKey(tar))
            {

                min=Math.min(min,i-h.get(tar));
            }


            h.put(prefix,i);


    
        }



        return min>=nums.length ? -1 : min;

        
        
    }
}