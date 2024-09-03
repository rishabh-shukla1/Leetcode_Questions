class Solution {
    public int partitionString(String s) {



        HashSet<Character> h=new HashSet<>();
        int ans=0;

        for(int i=0;i<s.length();i++)
        {
            if(h.contains(s.charAt(i)))
            {
                ans++;

                h.clear();
                h.add(s.charAt(i));

            }
            else
            {
                h.add(s.charAt(i));
            }


        }

        return ans+1;



        

        
    }
}