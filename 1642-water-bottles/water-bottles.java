class Solution {
    public int numWaterBottles(int numBottles, int numExchange) { 
        int k=0;
        int ans=0;
        int t=numBottles;

        while(numBottles>=numExchange)
        {
            numBottles=numBottles-numExchange;
            numBottles++;
            k++;


        }

        return t+k;
        
    }
}