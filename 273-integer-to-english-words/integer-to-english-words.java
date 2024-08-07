class Solution {
      String  less_20[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};


        String ten[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        String thousand[]={"","Thousand","Million","Billion"};
    public String numberToWords(int num) {

     
      


        if(num==0)
        return "Zero";

        String w="";
        int i=0;

        while(num>0)
        {
            if(num%1000 !=0)
            {
                w=make(num%1000)+thousand[i]+" "+w;


            }

            num=num/1000;
            i++;

        }


        return w.trim();
        

     
    }

    public String make(int num)
    {
        if(num==0)
        return "";
        else if(num<20)
        return less_20[num]+" ";
        else if(num<100)
        {
            return ten[num/10]+" "+make(num%10);
        }
        else
        {
            return less_20[num/100]+" Hundred "+make(num%100);
        }

    }
}