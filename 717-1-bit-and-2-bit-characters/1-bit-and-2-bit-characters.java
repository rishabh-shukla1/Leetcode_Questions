class Solution {
    public boolean isOneBitCharacter(int[] bits) {


        int c=0;
        int n=bits.length;
        for(int i=n-2;i>=0 && bits[i]!=0 ;i--)
        {
            c++;
        }

        return c%2==0;
            
    }
}