class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(int i:nums)
        {
            p.add(i);
        }
        k=nums.length-k;
        while(k-->0)
        {
            p.remove();
            
        }

        return p.remove();
        
    }
}