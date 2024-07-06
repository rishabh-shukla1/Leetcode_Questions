class Solution {
    public int passThePillow(int n, int time) {

        if(time<=(n-1))
        return time+1;

        int d=time/(n-1);

        if(d%2==0)
        {
            return  (time%(n-1))+1;
        }
    

    return n-(time%(n-1));


        
    }
}