class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.equals(needle))
        {
            return 0;
        }
        //  if(needle.length()==1)
        //  {
        //     for(int i=0;i<haystack.length();i++)
        //     {
        //         if(haystack.charAt(i)==needle.charAt(0))
        //         {
        //             return i;
        //         }
        //     }
        //  }

        for(int i=0;i<haystack.length()-needle.length()+1;i++)
        {
            String w=haystack.substring(i,needle.length()+i);
            System.out.println(w);
            if(w.equals(needle))
            return i;


        }

        return -1;
        
    }
}