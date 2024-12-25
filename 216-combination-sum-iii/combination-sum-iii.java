class Solution {
     
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>>ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        find(k,k,n,ll,l,1);

        return ll;
        
    }

    public  static void find( int t,int k,int n,List<List<Integer>>ll,List<Integer>l,int indx)
    {

        if(n==0 )
        {
            if(l.size()==t)
            ll.add(new ArrayList<>(l));
            return ;
        }
        if(k==0)
        {
            return ;
        }




        for(int i=indx;i<=9;i++)
        {
            if(n>=i && k>0)
            {
                l.add(i);
                find(t,k-1,n-i,ll,l,i+1);
                l.remove(l.size()-1);
            }

        }
    }
}