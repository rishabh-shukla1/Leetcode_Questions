class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> h=new HashSet();
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }

        for(int i:h)
        {
            if(!h.contains(i-1))
            {
                int t=i+1;

                while(h.contains(t))
                {
                    t++;
                }


                ans=Math.max(t-i,ans);
            }
        }


        return ans;
        
    }
}