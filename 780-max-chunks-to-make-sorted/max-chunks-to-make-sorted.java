class Solution {
    public int maxChunksToSorted(int[] arr) {

         int a[]=new int[arr.length];
         for(int i=0;i<arr.length;i++)
         {
            a[i]=arr[i];
         }

         Arrays.sort(a);

         int sum=0;
         int usum=0;
         int ans=0;

         for(int i=0;i<a.length;i++)
         {
            sum=sum+a[i];
            usum=usum+arr[i];

            if(sum==usum)
            {
                ans++;
            }
         }

         return ans;

       
        
    }

   
}