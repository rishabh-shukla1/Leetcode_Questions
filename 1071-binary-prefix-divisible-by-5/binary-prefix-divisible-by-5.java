class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {


        List<Boolean> l=new ArrayList<>();
int f=0;
        for(int i=0;i<nums.length;i++)
        {
            f=((f*2)+nums[i])%5;
             if(f%5==0)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }

        return l;
        
    }
}