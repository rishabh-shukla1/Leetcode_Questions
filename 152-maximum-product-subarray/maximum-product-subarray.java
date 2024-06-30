class Solution {
    public int maxProduct(int[] nums) {

       double sum1=1;
       double sum2=1;
        double max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        sum1=sum1*nums[i];
        sum2=sum2* nums[nums.length-1-i];

        max=Math.max(max,Math.max(sum1,sum2));
        if(sum1==0 ) sum1=1;

        if(sum2==0) sum2=1;


       }
        

        return  (int) max;
        
    }
}