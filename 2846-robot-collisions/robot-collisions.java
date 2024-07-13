class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] heath, String directions) {



        Integer index[]=new Integer[positions.length];

        for(int i=0;i<positions.length;i++)
        {
            index[i]=i;
        }
        

        Arrays.sort(index,(x,y)->Integer.compare(positions[x],positions[y]));


        Stack<Integer> s=new Stack<>();

        for(int i:index)
        {
            if(directions.charAt(i)=='R')
            {
                s.push(i);
            }
            else 
            {
                while(!s.isEmpty() && heath[i]>0)
                {
                    int t=s.peek();

                    if(heath[t]>heath[i])
                    {
                        heath[i]=0;
                        heath[t]-=1;
                    }
                    else if(heath[t]<heath[i])
                    {
                        heath[i]-=1;
                        heath[t]=0;

                        s.pop();
                    }
                    else 
                    {
                        heath[i]=0;
                        heath[t]=0;
                        s.pop();
                    }



                }
            }
        }


          List<Integer> l=new ArrayList<>();

         for(int i=0;i<heath.length;i++)
         {
            if(heath[i]>0)
            l.add(heath[i]);
         }


         return l;

        
        
    }
}