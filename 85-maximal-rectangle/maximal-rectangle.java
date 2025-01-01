class Solution {
    public int maximalRectangle(char[][] matrix) {

        int a[]=new int[matrix[0].length];

        int max=0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                    a[j]=a[j]+1;
                }
                else
                {
                    a[j]=0;
                }

            }

            int area=find(a);
            max=Math.max(area,max);
        }
        


        return max;
        
    }

    public static int find(int a[])
    {

        int ans=0;
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<a.length;i++)
        {
            while(!s.isEmpty() && a[i]<a[s.peek()])
            {

                int h=a[s.pop()];
                int r=i;

                if(!s.isEmpty())
                {
                    int l=s.peek();

                    ans=Math.max(ans,h*(r-l-1));
                }
                else
                {
                    ans=Math.max(ans,h*r);
                }

            }

            s.push(i);
        }


       int r=a.length;
       while(!s.isEmpty())
            {

                int h=a[s.pop()];
                

                if(!s.isEmpty())
                {
                    int l=s.peek();

                    ans=Math.max(ans,h*(r-l-1));
                }
                else
                {
                    ans=Math.max(ans,h*r);
                }

            }

        return ans;


    }
}