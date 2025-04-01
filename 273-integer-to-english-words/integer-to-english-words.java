class Solution {
    public String numberToWords(int num) {


        if(num==0)
        {
            return "Zero";
        }


        String less_20[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        String  t[]={"","Thousand","Million","Billion"};


        int group=0;

        String ans="";

        while(num>0)
        {

            if(num%1000 !=0)
            {
                String temp="";

                int val=num%1000;

                if(val>=100)
                {

                    temp=temp+less_20[val/100]+" Hundred ";
                    val=val%100;
                }
                if(val>=20)
                {
                    temp=temp+tens[val/10]+" ";
                    val=val%10;

                }

                if(val>0)
                {
                    temp=temp+less_20[val]+" ";
                }


                temp=temp+t[group]+" ";

                ans=temp+ans;






            }

            num=num/1000;
            group++;
        }

        return ans.trim();
        
    }
}