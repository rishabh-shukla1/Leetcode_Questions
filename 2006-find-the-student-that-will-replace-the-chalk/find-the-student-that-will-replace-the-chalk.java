class Solution {
    public int chalkReplacer(int[] chalk, int k) {
          int   i=0;

        while(k>=0)
        {
            int f=0;

            for (i=0;i<chalk.length;i++)
            {
                if(k-chalk[i]>=0)
                {
                   

                    k=k-chalk[i];
                }
                else
                {
                    return i;
                }

            }





            if(k==0)
            {
                return 0;
            }
        }


       



        

     return 0;

        
    }
}