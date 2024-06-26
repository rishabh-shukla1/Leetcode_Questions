class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    Map<Integer,Integer> t=new HashMap<>();

    for(int i:nums)
    {
        t.put(i,t.getOrDefault(i,0)+1);


    }
    int a[]=new int[k];

    List<Map.Entry<Integer,Integer>> l=new  ArrayList<>(t.entrySet());

    System.out.println(l);

    Collections.sort(l,(x,y)->y.getValue()-x.getValue());  // ***********

    for(int i=0;i<k;i++)
    {
        a[i]=l.get(i).getKey();      
    }

    return a;
}
}