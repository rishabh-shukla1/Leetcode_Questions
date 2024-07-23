class Solution {
    public int[] frequencySort(int[] nums) {

        int a[]=new int[nums.length];
        HashMap<Integer,Integer> t=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            t.put(nums[i],t.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>>l=new ArrayList<>(t.entrySet());

    Collections.sort(l,(x,y)->(x.getValue()==y.getValue()) ? y.getKey()-x.getKey() :x.getValue()-y.getValue() );
        


        System.out.println(l);

            int f=0;
        for(int i=0;i<l.size();i++)
        {
            for(int j=0;j<l.get(i).getValue();j++)
            {
                a[f++]=l.get(i).getKey();
            }
        }

        return a;










        
    }
}