class Solution {
    public int[] maxSubsequence(int[] nums, int k) {


        PriorityQueue<int []> p=new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i=0;i<nums.length;i++)
        {
            p.add(new int[]{nums[i],i});
            if(p.size()>k)
            {
                p.poll();
            }
        }


        HashSet<Integer> h=new HashSet<>();

        while(!p.isEmpty())
        {
            int t[]=p.poll();
            h.add(t[1]);
        }

        int b[]=new int[k];
        int t=0;

        for(int i=0;i<nums.length && t<k;i++)
        {
            if(h.contains(i))
            {
                b[t]=nums[i];
                t++;

            }
        }
        return b;

        




      
        
    }
}