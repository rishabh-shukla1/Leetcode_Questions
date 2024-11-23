class Solution {
    public int rob(int[] nums) {
      if(nums.length==1)
      {
        return nums[0];
      }



        int a[]=new int[nums.length-1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=nums[i];

        }

        int ans1=find(a);


        for(int i=0;i<a.length;i++)
        {
            a[i]=nums[i+1];

        }
        int ans2=find(a);

        return Math.max(ans1,ans2);




        
    }


    public static int find(int a[])
    {
         int prev=a[0];
         int prev2=0;

         for(int i=1;i<a.length;i++)
         {
             
             int take=a[i];
             if(i>1) { take+= prev2;}

             int nottake=prev;

             int curr=Math.max(take,nottake);
             prev2=prev;
             prev=curr;
             
         }

         return prev;
    }
}