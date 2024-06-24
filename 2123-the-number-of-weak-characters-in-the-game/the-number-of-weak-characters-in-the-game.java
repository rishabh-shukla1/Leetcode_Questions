class Solution {
    public int numberOfWeakCharacters(int[][] arr) {


      Arrays.sort(arr, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

      

          int ans=0;
          int m=arr[arr.length-1][1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(m>arr[i][1])
            {
                ans++;
            }
            else
            {
                m=arr[i][1];
            }


            

        }

        return ans;



        
    }
}