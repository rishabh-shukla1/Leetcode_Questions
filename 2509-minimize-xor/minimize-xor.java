class Solution {
    public int minimizeXor(int num1, int num2) {

        int count=0;
         while(num2>0)
         {

           num2=num2 & (num2-1);
            count++;
         }

         int ans=0;

         for(int i=31 ;i>=0 && count>0;i--)
         {

            if((num1 & (1<<i)) !=0)
            {
                ans=ans+(1<<i);
                count--;

            }
         }

         for(int i=0;i<=31 && count>0 ;i++)
         {

            if((num1 &(1<<i))==0 )
            {
                ans=ans+(1<<i);
                count--;
            }
         }

         return ans;
        
    }
}