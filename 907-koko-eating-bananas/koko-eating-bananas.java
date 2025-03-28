class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max=Arrays.stream(piles).max().getAsInt();
       


        int i=1;
        int j=max;

        int ans=0;

        while(i<j)
        {


            int mid=(i+j)/2;
            int k=0;

            for(int t:piles)
            {
                k=k+(int)Math.ceil( (double)t/mid);
            }

            if(k>h)
            {

                i=mid+1;

            }
            else{
                j=mid;
            }
        }


        return j;

        
    }
}