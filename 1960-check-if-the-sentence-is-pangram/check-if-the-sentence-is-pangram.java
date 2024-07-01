class Solution {
    public boolean checkIfPangram(String s) {

       int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int y=((int)s.charAt(i))-97;

            a[y]++;
            
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            return false;
        }

        return true;
        
    }
}