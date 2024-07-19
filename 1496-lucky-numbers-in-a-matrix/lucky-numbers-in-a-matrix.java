class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer>l =new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            int t=Integer.MAX_VALUE;
            int f=1;
            int k=0;

            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<t)
                {
                    t=matrix[i][j];
                    f=j;
                }
            }

            for(int j=0;j<matrix.length;j++)
            {
                  if(matrix[j][f]>t)
                  {
                    k=-1;
                  }
            }



            if(k==0)
            l.add(t);
        }

     
        return l;
        
    }
}