class Solution {
    public String largestNumber(int[] nums) {


        String s[]=new String [nums.length];

        for(int i=0;i<nums.length;i++)
        {
            s[i]=Integer.toString(nums[i]);

        }

        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));

        String w="";
        for(int i=0;i<s.length;i++)
        {
            w=w+s[i];
        }

        if(w.charAt(0)=='0')
        return "0";

        return w;



    
    
        
    }
    
}