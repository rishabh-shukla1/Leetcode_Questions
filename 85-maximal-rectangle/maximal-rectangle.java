class Solution {
    public int maximalRectangle(char[][] m) {

        int[] a=new int[m[0].length];
      int ans=0;
        for(int i=m.length-1;i>=0;i--)
        {
            if(i==m.length-1)
            {
                
                 for (int j = 0; j < m[0].length; j++) {
                    a[j] = (m[i][j] == '1') ? 1 : 0;  
                }
            }
            else
            {
                for(int j=0;j<m[0].length;j++)
                {
                    a[j]=m[i][j]=='1' ? a[j]+1 :0;
                }
            }
            ans=Math.max(ans,Area(a));
        }

        return ans;
        
    }

    public static int Area(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int ans = 0;

        for(int i=0;i<arr.length;i++)
        {

            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                int h=arr[st.pop()];

                int r=i;

                if(!st.isEmpty())
                {
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
                else
                {
                    ans=Math.max(ans,h*r);
                }
            }
            st.push(i);
        }

        int r=arr.length;

        while(!st.isEmpty())
            {
                int h=arr[st.pop()];

                

                if(!st.isEmpty())
                {
                    int l=st.peek();
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