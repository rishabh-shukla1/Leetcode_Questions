class Solution {
    public int lengthOfLongestSubstring(String s) {


        HashSet<Character > h=new HashSet<>();
        int ans=0;
        int t=0;
        for(int i=0;i<s.length();i++)
        {

            if(!h.contains(s.charAt(i)))
            {
                h.add(s.charAt(i));

                ans=Math.max(ans,h.size());
            }
            else
            {
                while(h.contains(s.charAt(i)))
                {
                    h.remove(s.charAt(t));
                    t++;

                }

                h.add(s.charAt(i));

            }


            
        }

        return ans;

          
        
    }
}