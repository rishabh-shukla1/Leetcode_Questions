class Solution {
    public int findComplement(int num) {

        int result=0;
        int i=0;

        while(num>0)
        {
           


            if((num & 1)!=1) 
              result+=(int ) Math.pow(2,i);

              i++;

              
            num=num>>1;
        }

        return result;
        
    }
}