class Solution {
    public int scheduleCourse(int[][] courses) {


        Arrays.sort(courses,(a,b)->a[1]-b[1]);

        PriorityQueue<Integer>p=new PriorityQueue<>((a,b)->b-a);
        int totaltime=0;

        for(int i=0;i<courses.length;i++)
        {

            int duration=courses[i][0];
            int lastday=courses[i][1];

            totaltime+=duration;
            p.add(duration);

            if(totaltime>lastday)
            {
                totaltime-=p.poll();
               

            }



            
        }

        return p.size();

        
    }
}