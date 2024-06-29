class Solution {
    public List<List<Integer>> generate(int rows) {

        List<List<Integer>> a=new ArrayList<>();
        if(rows==0)
        return a;

        List<Integer> l=new ArrayList<>();

        l.add(1);
        a.add(new ArrayList<>(l));
        if(rows==1)
        return a;

        l.add(1);
        a.add(new ArrayList<>(l));

        if(rows==2)
        return a;


        for(int i=2;i<rows;i++)
        {
            List<Integer> b=a.get(i-1);
            l=new ArrayList<>();
            l.add(1);
            for(int j=0;j<b.size()-1;j++)
            {
                int t=b.get(j)+b.get(j+1);
                l.add(t);

            }
            l.add(1);
            a.add(new ArrayList<>(l));
        }


        return a;




        
    }
}