class Solution {
    public int minimumDeletions(String s) {

         int c=0;
         int ans=0;


        

         for(char t:s.toCharArray())
         {

            if(t=='b')
            c++;
            else if(c>0)
            {
                c--;
                ans++;
            }
         }

         return ans;
        
    }
}