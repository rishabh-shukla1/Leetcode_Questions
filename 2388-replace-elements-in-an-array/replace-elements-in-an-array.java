class Solution {
    public int[] arrayChange(int[] nums, int[][] operation) {


        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],i);

        }

        for(int i=0;i<operation.length;i++)
        {
            int t=h.get(operation[i][0]);
            nums[t]=operation[i][1];

            h.remove(operation[i][0]);

            h.put(nums[t],t);



            
        }

        return nums;
        
    }
}