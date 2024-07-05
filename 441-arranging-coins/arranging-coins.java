class Solution {
    public int arrangeCoins(int n) {

        int s=1;

        if(n==1)
        return 1;

        while(n>=s)
        {
            n=n-s;
            s++;

        }


        return s-1;


        
        
    }
}