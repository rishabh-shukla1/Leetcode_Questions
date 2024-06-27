class Solution {
    public int minOperations(int[] a, int x) {

        int sum=0;
        
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }

        int l=0;
        int s=0;
        int ans=-1;

        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];

            while(l<=i && s>sum-x)   s=s-a[l++];

            if(s==sum-x)  ans=Math.max(ans,i-l+1);



        }
        if(ans==-1)
        return -1;


        return a.length-ans;

       

        
    }
}