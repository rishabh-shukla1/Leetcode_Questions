class Solution {
    public int maxDistance(List<List<Integer>>l) {



        int min1=l.get(0).get(0);
        int max1=l.get(0).get(l.get(0).size()-1);


        int ans=0;


        for(int i=1;i<l.size();i++)
        {

            List<Integer> ll=l.get(i);


            int min=ll.get(0);
            int max=ll.get(ll.size()-1);


           


            ans=Math.max(ans,Math.max(Math.abs(min-max1),Math.abs(min1-max)));



            
               min1=Math.min(min,min1);
            max1=Math.max(max,max1);


          





        }


        return ans;
        
    }
}