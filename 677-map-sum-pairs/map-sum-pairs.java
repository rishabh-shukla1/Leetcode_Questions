class MapSum {

    HashMap<String, Integer> h;

    public MapSum() {
        h=new HashMap<>();
        
    }
    
    public void insert(String key, int val) {
        h.put(key,val);
        
    }
    
    public int sum(String prefix) {

        Set<String> set=h.keySet();

        int c=0;
        for(String s:set)
        {
            if(s.startsWith(prefix) )
            c=c+h.get(s);
        }

        return c;


    




        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */