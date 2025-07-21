class Solution {
    public int candy(int[] ratings) {

      int n=ratings.length;
        int a[]=new int[n];
        Arrays.fill(a,1);

        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                a[i]=a[i-1]+1;
            }
        }

        for(int i=n-1;i>0;i--)
        {
            if(ratings[i-1]>ratings[i])
            {
                a[i-1]=Math.max(a[i]+1,a[i-1]);
            }
        }


        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }



        return sum;
        
    }
}