class Solution {
    public int[] findEvenNumbers(int[] d) {


        List<Integer> l=new ArrayList<>();


        int a[]=new int[10];

        for(int i=0;i<d.length;i++)
        {
             a[d[i]]++;


        }

        for(int i=100; i<=999 ;i=i+2)
        {

            int x=i%10;
            int y=(i/10)%10;
            int z=(i/100)%10;

            a[x]--;
            a[y]--;
            a[z]--;

            if(a[x]>=0 && a[y]>=0 && a[z]>=0)
            l.add(i);

            a[x]++;
            a[y]++;
            a[z]++;

        }

        Collections.sort(l);

        int ans[]=new int[l.size()];

        for(int i=0;i<l.size();i++)
        {
            ans[i]=l.get(i);
        }


        return ans;

        
        
    }
}