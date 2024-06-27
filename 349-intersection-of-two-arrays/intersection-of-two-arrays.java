class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums1)
        {
            h.add(i);
        }
                HashSet<Integer> h1=new HashSet<>();

                for(int i=0;i<nums2.length;i++)
                {
                    if(h.contains(nums2[i]))
                    {
                        h1.add(nums2[i]);
                    }
                }

                int a[]=new int[h1.size()];
              int t=0;
            for(int i:h1)
                {
                    a[t++]=i;
                }


                return a;


        
    }
}