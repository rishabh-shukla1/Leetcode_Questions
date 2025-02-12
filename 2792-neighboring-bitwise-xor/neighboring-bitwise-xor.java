class Solution {
    public boolean doesValidArrayExist(int[] derived) {

       

        
          int c=0;

        for(int i=0;i<derived.length;i++)
        {
            c=c^derived[i];
        }


        return c==0;
        
    }
}