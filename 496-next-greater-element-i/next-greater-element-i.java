class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int a[]=new int[nums1.length];

        Arrays.fill(a,-1);
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[k]>nums1[i])
                        {
                            a[i]=nums2[k];
                            break;
                        }
                    }
                }

            }
        }


        return a;
        
    }
}