class Solution {
    public int maxChunksToSorted(int[] arr) {

        int f[]=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            f[arr[i]]=i;

        }
        int c=0;

        int j=-1;

        for(int i=0;i<arr.length;i++)
        {
            j=Math.max(j,f[i]);
            if(j==i)c++;
        }

        return c;
        
    }

   
}