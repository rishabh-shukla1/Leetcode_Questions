class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> h=new HashMap<>();

        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);

        }


        for(int i=0;i<ransomNote.length();i++)
        {
              char ch=ransomNote.charAt(i);
            if(h.containsKey(ch) && h.get(ch)>0)
            h.put(ch,h.getOrDefault(ch,0)-1);
            else
            {
                return false;
            }
        }

        return true;
        
    }
}