class Solution {
    public int minimumRounds(int[] task) {

        Arrays.sort(task);

        int t=1;

        int ans=0;

        for(int i=0;i<task.length-1;i++)
        {
           
            if(task[i]==task[i+1])
            {
                t++;
               
            }
             else
            {
                if(t==1)
                {
                    return -1;
                }
                ans=ans+(t/3);

                if(t%3!=0)
                {
                    ans=ans+1;
                }

                t=1;
            }
              

        }
        if(t==1)
                {
                    return -1;
                }
                ans=ans+(t/3);

                if(t%3!=0)
                {
                    ans=ans+1;
                }

        

        return ans;
}
}