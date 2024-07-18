class Solution {
    public String intToRoman(int num) {


        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String  ch[]={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX","V","IV","I"};

        int i=0;
        String w="";


        while(num>0)
        {
            if(num>=a[i]) 
            {
                w=w+ch[i];
                num=num-a[i];             
            }
            else
            {
                i++;
            }
        }



        return w;

      
        
    }
}