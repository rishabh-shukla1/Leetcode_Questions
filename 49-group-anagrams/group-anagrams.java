class Solution {
    public List<List<String>> groupAnagrams(String[] s) {

        HashMap<String , List<String>> h=new HashMap<>();

        for(int i=0;i<s.length;i++)
        {
            char ch[]=s[i].toCharArray();

            Arrays.sort(ch);

            String a=String.valueOf(ch);

            if(! h.containsKey(a))
            {
                h.put(a,new ArrayList<String>());


            }

            h.get(a).add(s[i]);


        }

        return new ArrayList<>(h.values());

        
        
    }
}