class Solution {
    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

       List<int[]> l=new ArrayList<>();

        for(int inter[]:intervals)
        {


            if(l.isEmpty() || l.get(l.size()-1)[1]< inter[0])
            {
                l.add(inter);
            }
            else
            {
                l.get(l.size()-1)[1]=Math.max(inter[1],l.get(l.size()-1)[1]);

            }
           




        }




        return l.toArray(new int[l.size()][]);


        
        
    }
}