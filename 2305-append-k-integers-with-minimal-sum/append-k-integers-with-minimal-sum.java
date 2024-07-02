class Solution {
    public long minimalKSum(int[] nums, int k) {

        Arrays.sort(nums);

        long c=1;

        long sum=0;

        for(int i:nums)
        {
            if(i>c)
            {
                while(c<i && k>0)
                {
                    sum=sum+c;
                    c++;
                    k--;
                }
            }
            
                c=i+1;
            
        }

        while(k>0)
        {
            sum=sum+c;
            c++;
            k--;

        }

        return sum;
    

     

        
    }
}