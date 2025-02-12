class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int n1=nums1.length;
        int n2=nums2.length;


        int c1=0;
        int c2=0;

        for(int i=0;i<nums1.length;i++)
        {
            c1=c1^nums1[i];
        }

          for(int i=0;i<nums2.length;i++)
        {
            c2=c2^nums2[i];
        }


        if(n1%2==0 && n2%2==0)
        {
            return 0;
        }
        else if(n1%2!=0 && n2%2!=0)
        {

            return c1^c2;

            
        }
        else if(n1%2==0)
        {
            return c1;
        }


        return c2;


        
    }
}