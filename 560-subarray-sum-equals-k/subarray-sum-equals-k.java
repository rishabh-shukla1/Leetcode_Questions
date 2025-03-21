class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> h=new HashMap<>();

        int sum=0;
        int ans=0;
        h.put(0,1);


        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(h.containsKey(sum-k))
            {
                ans=ans+h.get(sum-k);
            }


            h.put(sum,h.getOrDefault(sum,0)+1);
            
        }


        return ans;
        
    }
}