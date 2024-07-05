class Solution {
    public int countSegments(String s) {

    int t=0;

    s=s.trim();

    if(s.length()==0)
    return 0;

    for(int i=0;i<s.length();i++)
    {
        int y=(int)s.charAt(i);

        if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
        continue;

        if(y==32)
        {
            t++;
        }
    }


    return t+1;

        
    }
}