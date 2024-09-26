class Solution {
    public int longestConsecutive(int[] nums) {


        if(nums.length<=0)
        {
            return 0;
        }

        HashSet<Integer> h=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        } 
             int c=0;
        for(int i:h)
        {
            if(!h.contains(i-1))
            {
                
               int y=i+1;
                while(h.contains(y))
                {
                    y++;
                }
                c=Math.max(c,y-i);
            }
        }

        return c;


       
        
    }
}