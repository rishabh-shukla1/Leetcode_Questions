class Solution {
    public int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);
        int c=0;
        int m=money;
        for(int i=0;i<prices.length;i++)
        {

            if(prices[i]<=money)
            {
                money=money-prices[i];
                c++;
            }

            if(c==2)
            {
                return money;
            }


        }
        return m;
        
    }
}