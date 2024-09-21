class Solution {
    public List<Integer> lexicalOrder(int n) {


        HashSet<Integer> l=new HashSet<>();
        List<Integer> ll=new ArrayList<>();
     
    for(int i=1;i<=n;i++)
    {
        find(n,l,String.valueOf(i),ll);
    }

   

        return ll;
        
    }

    public static void find(int n ,HashSet<Integer>l,String s,List<Integer>ll)
    {
        if( Integer.parseInt(s)>n)
        {
            return ;
        }
        if(!l.contains(Integer.parseInt(s)))
        {
        l.add(Integer.parseInt(s));
        ll.add(Integer.parseInt(s));
        }


        for(int j=0;j<=9;j++)
        {
            
            find(n,l,s+Integer.toString(j),ll);
            

        }

        


    }
}