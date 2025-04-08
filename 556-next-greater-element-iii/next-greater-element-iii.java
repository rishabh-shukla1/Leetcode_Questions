class Solution {
    public int nextGreaterElement(int n) {

            String s=Integer.toString(n);

            if(n<10)
            {
                return -1;
            }

        int nums[]=new int[s.length()];

        for(int i=0;i<s.length();i++)
        {
            nums[i]=s.charAt(i)-'0';
        }

        
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
            int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=(ans*10)+nums[i];

        }

        if(ans>Integer.MAX_VALUE || n>=ans)
        {
            return -1;
        }

      return ans;

    

        
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