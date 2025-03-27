class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> l=new ArrayList<>();

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                l.add(nums1[i++]);
            }
            else
            {
                l.add(nums2[j++]);
            }
        }


        while(i<nums1.length) l.add(nums1[i++]);
         while(j<nums2.length) l.add(nums2[j++]);

        
         if(l.size() %2 ==0)
         {
            return ( l.get(l.size()/2) + l.get((l.size()/2)-1))/2.0;
         }
         else
         {
            return l.get((l.size()-1)/2);
         }

        
        
    }
}