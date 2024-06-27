class Solution {
    public char findTheDifference(String s, String t) {

     int sum=0;
     for(int i=0;i<t.length();i++)
     {
        sum=sum+((int )t.charAt(i));
     }

     for(int j=0;j<s.length();j++)
     {
        sum=sum-((int )s.charAt(j));
     }

       return (char)sum;
    }
}


    