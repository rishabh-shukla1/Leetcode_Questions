class Solution {
    public String kthDistinct(String[] arr, int k) {


        HashMap<String, Integer>h=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);

        }

        System.out.println(h);
        for(int i=0;i<arr.length;i++)
        {
            int t=h.get(arr[i]);

            if(t==1)
            {
                if(k==1)
                return arr[i];

                k--;
            }
            


        }



        return "";
        
    }
}