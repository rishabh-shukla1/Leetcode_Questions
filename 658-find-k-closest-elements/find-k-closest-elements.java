class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x)
    
     {

        int l=0;
        int h=arr.length-1;

        List<Integer> ll=new ArrayList<>();

        while(h-l >=k)
        {
            if(Math.abs(arr[l]-x) > Math.abs(arr[h]-x))
            {
                l++;

            }
            else
            {
                h--;
            }
        }


   for(int i=l;i<=h;i++)
   {
    ll.add(arr[i]);
   }

   return ll;
        

 
        
    }
}