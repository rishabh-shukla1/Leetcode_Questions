class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int a[]=new int[nums.length+1];
        List<Integer> l=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }

        for(int i=1;i<=nums.length;i++)
        {
            if(a[i]==0)
            l.add(i);

        }

        return l;

        
    }
}