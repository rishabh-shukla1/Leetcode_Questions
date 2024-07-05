class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        List<Integer> l=new ArrayList<>();


        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            l.add(i);


        }

        for(int i=0;i<l.size()-1;i++)
        {
            if((l.get(i+1)-l.get(i))<k+1)
            {
                return false;

            }
        }

        return true;


        
    }
}