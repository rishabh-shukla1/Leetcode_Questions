class Solution {
    public List<List<Integer>> findWinners(int[][] m) {

        HashMap<Integer ,Integer> h=new HashMap<>();

        TreeSet<Integer> zero =new TreeSet<>();
        TreeSet<Integer> one=new TreeSet<>();

        List<List<Integer>> l=new ArrayList<>();



        for(int i=0;i<m.length;i++)
        {
          h.put(m[i][1],h.getOrDefault(m[i][1],0)+1);
        }

        for(Map.Entry<Integer ,Integer> s: h.entrySet())
        {
            int t=s.getValue();

           
            if(t==1) one.add(s.getKey());

        }
        for(int i=0;i<m.length;i++)
        {
            if(!h.containsKey(m[i][0]))
            {
                zero.add(m[i][0]);
            }

        }

        List<Integer> l1=new ArrayList<>();
        List<Integer>  l2=new ArrayList<>();

        for(int i:zero)
        {
            l1.add(i);
        }

         for(int i:one)
        {
            l2.add(i);
        }
        l.add(l1);
        l.add(l2);


        return l;
        
    }
}