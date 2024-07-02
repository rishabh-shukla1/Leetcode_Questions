class Solution {
    public int[][] kClosest(int[][] points, int k) {

       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> (b[2]-a[2]));

     for(int i=0;i<points.length;i++){ 
            pq.offer(new int[]{points[i][0],points[i][1],(points[i][0]*points[i][0]+points[i][1]*points[i][1])});
            if(pq.size() > k) pq.poll();
        }

        int size = pq.size();
        int[][] out = new int[size][2];
        for(int i=0;i<size;i++){
         out[i][0] = pq.peek()[0];
         out[i][1] = pq.poll()[1];  
        }
        return out;
        
    }
}