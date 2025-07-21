class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
          int sum=0;
          int sum1=0;
          int ans=0;


        for(int i=0;i<gas.length;i++)
        {
            sum=sum+gas[i]-cost[i];
              sum1=sum1+gas[i]-cost[i];

             if(sum<0)
             {
                sum=0;
                ans=i+1;


             }


            
        }

         if(sum1<0)
             {
                return -1;
                
             }


             return ans;
    }
}