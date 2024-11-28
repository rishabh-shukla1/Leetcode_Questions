class Solution {
    public void nextPermutation(int[] nums) {
        int k=-1;
        
    

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
               
                k=i;
                break;
            }

        }
    
        for(int i=nums.length-1;(i>=0 && k>=0);i--)
        {
            if(nums[i]>nums[k])
            {
               int t=nums[i];
               nums[i]=nums[k];
               nums[k]=t;
               break;
            }
        }

        reverse(k+1,nums.length-1,nums);

    

        
    }
    public static void  reverse(int i,int j,int a[])
    {
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }

    }
}