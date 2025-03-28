class Solution {
    public int splitArray(int[] nums, int k) {

        int i=Arrays.stream(nums).max().getAsInt();
        int j=Arrays.stream(nums).sum();
        

        while(i<=j)
        {

            int mid=(i+j)/2;

            if(pos(mid,nums,k))
            {
                j=mid-1;



            }
            else
            {
                i=mid+1;

            }
        }


        return i;


        
    }


    public static  boolean pos(int maxsum,int a[],int k)
    {

       int s=0;
       int count=1;
        for(int i:a)
        {
            if(i+s > maxsum)
            {
                count++;
                s=i;
            }

            else
            {
                s=s+i;
            }


            if(count>k)
            {
                return false;
            }
        }

        return true;


    }
}