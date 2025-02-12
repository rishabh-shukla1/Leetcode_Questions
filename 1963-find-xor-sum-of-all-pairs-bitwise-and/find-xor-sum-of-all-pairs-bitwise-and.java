class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {

        int xor=0;
        for(int i=0;i<arr1.length;i++)
        {
            xor=xor^arr1[i];
        }

        int p=0;


        for(int i=0;i<arr2.length;i++)
        {
            p=p^arr2[i];
        }


        return xor & p;
        
    }
}