class Solution {
    public boolean isBalanced(String num) {

        int odd=0;
        int even=0;

        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
               
               
                even=even+(int)num.charAt(i)-48;
            }
            else
            {


                odd=odd+(int)num.charAt(i)-48;

            }
        }

        if(odd==even)
        {
            return true;
        }

        return false;
        
    }
}