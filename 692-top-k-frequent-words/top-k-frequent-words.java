class Solution {
    public List<String> topKFrequent(String[] w, int k) {

        List<String> l=new ArrayList<>(); 
        HashMap<String ,Integer> h=new HashMap<>();

        for(int i=0;i<w.length;i++)
        {
            h.put(w[i],h.getOrDefault(w[i],0)+1);
        }


        List<Map.Entry<String,Integer>>ll=new ArrayList<>(h.entrySet());

        Collections.sort(ll,(a,b)-> {
                if(a.getValue() != b.getValue())
                    return b.getValue()-(a.getValue());
                return -b.getKey().compareTo(a.getKey());
            });

        for(int i=0;i<ll.size();i++)
        {
            l.add(ll.get(i).getKey());
            k--;
            if(k==0)
            break;
        }

        System.out.println(ll);


    


        return l ;


        
    }
}