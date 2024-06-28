class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            p.add(nums[i]);
        }
      
        while(k-->0)
        {
            int t=p.poll();
        
            t++;
            p.add(t);

        }
        System.out.print(p);

        int d = 1000000007;

        long ans=1;
        while(!p.isEmpty())
        {
            ans=ans*p.poll() %d;
            
        }


        return (int)ans;
        
    }
}