class Solution {
    public int thirdMax(int[] nums) {


             TreeSet<Integer> l=new TreeSet<>();
             for(int i:nums)
             l.add(i);

            int len=l.size();

             Integer a[]=new Integer[len];

             a=l.toArray(a);


             if(len<3)
             {
                return a[len-1];
             }


             return a[len-3];
        
    }
}