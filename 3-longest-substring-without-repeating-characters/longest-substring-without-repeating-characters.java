class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> h=new HashSet<>();
            int t=0;
            int ans=0;

        for(int i=0;i<s.length();i++)
        {

            char ch=s.charAt(i);

            if( !h.contains(ch))
            {
                h.add(ch);

                ans=Math.max(ans,h.size());
            }
            else
            {
                while( h.contains(ch))
                {
                    h.remove(s.charAt(t));
                    t++;
                    
                }

                h.add(ch);

            }
        }

        return ans;
        
    }
}