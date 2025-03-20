class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer>l=new ArrayList<>();

        List<List<Integer>> ll=new ArrayList<>();

        find(nums,l,ll,0);

        return ll;
        
    }

    public static void find(int []nums,List<Integer>l,List<List<Integer>> ll,int i)
    {

        ll.add(new ArrayList<>(l));

        for(int j=i;j<nums.length;j++)
        {
            l.add(nums[j]);
            find(nums,l,ll,j+1);
            l.remove(l.size()-1);
        }
    }
}