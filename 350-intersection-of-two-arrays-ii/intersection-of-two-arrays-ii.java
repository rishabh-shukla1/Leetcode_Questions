class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {


          int a[]=new int [1001];
        List<Integer> b=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            a[nums1[i]]++;


        }

        for(int i=0;i<nums2.length;i++)
        {
            if(a[nums2[i]]>0)
            {
                b.add(nums2[i]);
                a[nums2[i]]--;
                

            }
            
        }

        System.out.println(b);

        int c[]=new int[b.size()];

        for(int i=0;i<c.length;i++)
        {
            c[i]=b.get(i);
        }

        return c;
        
        
    }
}