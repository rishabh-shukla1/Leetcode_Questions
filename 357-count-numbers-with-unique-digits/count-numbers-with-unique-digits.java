class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if(n==0) return 1;
        if(n==1) return 10;


        int a=9;
        int d=9;
        int total=10;


        for(int i=2;i<=n;i++)
        {

            a=a*d;
            d--;
            total+=a;
            

        }

        return total;

    





        
        
    }
}