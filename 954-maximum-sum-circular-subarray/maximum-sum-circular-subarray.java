class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total=0;

        int currmax=0;
        int maxsum=Integer.MIN_VALUE;

        int  currmin=0;
        int minsum=Integer.MAX_VALUE;

        for(int i:nums)
        {

            currmax=Math.max(i,currmax+i);
            maxsum=Math.max(currmax,maxsum);

            currmin=Math.min(i,currmin+i);
            minsum=Math.min(currmin,minsum);

            total=total+i;

        }


        return maxsum>0 ? Math.max(maxsum,total-minsum) :maxsum;
        
    }
}