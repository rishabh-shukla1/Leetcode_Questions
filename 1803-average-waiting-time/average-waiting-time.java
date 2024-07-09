class Solution {
    public double averageWaitingTime(int[][] c) {

         double at=c[0][0];
         double ct=c[0][0]+c[0][1];
         double avg=ct-at;

         for(int i=1;i<c.length;i++)
         {
            if(ct>=c[i][0])
            ct=ct+c[i][1];
            else
            ct=c[i][0]+c[i][1];

            avg=avg+(ct-c[i][0]);
         }

         return avg/c.length;
        
    }
}