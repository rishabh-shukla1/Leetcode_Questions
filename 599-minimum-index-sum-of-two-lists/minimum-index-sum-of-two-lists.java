class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {


        HashMap<String,Integer> s=new HashMap<>();

        for(int i=0;i<list1.length;i++)
        {
            s.put(list1[i],i);
        }

        int d=Integer.MAX_VALUE;

        

        List<String> g=new ArrayList<>();

        for(int i=0;i<list2.length;i++)
        {
        
            if(s.containsKey(list2[i] ))

            {
                int f=s.get(list2[i])+i;
                if(d>=f)
                {
                    if(d==f)
                    g.add(list2[i]);
                    else
                    {
                        g=new ArrayList<>();
                        g.add(list2[i]);
                    }

                    d=f;
                    
                }
            }
        }


    String  w[]=new String[g.size()];
        for(int i=0;i<g.size();i++)
        {
            w[i]=g.get(i);
        }
             


        return w;

        
    }
}