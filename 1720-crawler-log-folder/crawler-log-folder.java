class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(int i=0;i<logs.length;i++)
        {
            if(c<0)
            c=0;
            
            if(logs[i].equals("../"))
            {
                c--;
            }
            else if(logs[i].equals("./"))
            {
                continue;
            }
            else
            {
                c++;
            }
        }
        if(c<0)
        return 0;
        return c;
        
    }
}