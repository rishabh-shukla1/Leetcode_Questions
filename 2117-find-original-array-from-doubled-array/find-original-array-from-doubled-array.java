class Solution {
    public int[] findOriginalArray(int[] a) {

        if(a.length%2!=0) return new int[0];
        TreeMap<Integer,Integer> m=new  TreeMap<>();

        

        for(int i=0;i<a.length;i++)
        {
            m.put(a[i],m.getOrDefault(a[i],0)+1);

        }
        System.out.println(m);
          Arrays.sort(a);
        int ans[]=new int[a.length/2];
        int t=0;

        for(int i=0;i<a.length;i++)
        {
            if(m.get(a[i])<=0) continue;

          if(m.getOrDefault(a[i]*2,0)<=0)
          {
            return new int [0];

          }

          ans[t++]=a[i];

          m.put(a[i],m.get(a[i])-1);
          m.put(a[i]*2,m.get(a[i]*2)-1);




        }

        

        return ans;


        
    }
}