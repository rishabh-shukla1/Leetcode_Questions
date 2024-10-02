class Solution {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer,Integer> h=new HashMap<>();

        int b[]=new int[arr.length];

        for(int i=0;i<b.length;i++)

        {
            b[i]=arr[i];
        }
        Arrays.sort(b);
   int j=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!h.containsKey(b[i]))
            h.put(b[i],j++);
        }


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=h.get(arr[i]);
        }





        


    

        

       return arr;

           
    }
}