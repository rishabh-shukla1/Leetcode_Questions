class Solution {
    public String[] sortPeople(String[] names, int[] heights) {



        HashMap< Integer, String> s=new HashMap<>();


        for(int i=0;i<names.length;i++)
        {
            s.put(heights[i],s.getOrDefault(heights[i],"")+names[i]);
        }

        List<Map.Entry<Integer,String>>l=new ArrayList<>(s.entrySet());


        Collections.sort(l,(x,y)->y.getKey()-x.getKey());

        String t[]=new String[names.length];

        for(int i=0;i<s.size();i++)
        {
            t[i]=l.get(i).getValue();

        }


        return t;



        
    }
}