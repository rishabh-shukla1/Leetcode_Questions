class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        Arrays.sort(hand);

        PriorityQueue<Integer> q=new PriorityQueue<>();

        for(int i=0;i<hand.length;i++)
        {
            q.add(hand[i]);

        }

        Queue<Integer> q1=new LinkedList<>();
         int p=-1;
         int k=0;
         
        while(!q.isEmpty())
        {
            int t=q.poll();
            if(p==-1 ||( t-p)==1)
            {
                k++;
                p=t;
            }
            else
            {
                q1.add(t);
            }


            if(k==groupSize)
            {
                k=0;
                p=-1;

                while(!q1.isEmpty())
                {
                    q.add(q1.poll());
                }
                

            }

        }
        if(k>0)
        return false;

        return true;



        
        
    }
}