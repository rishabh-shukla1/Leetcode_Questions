class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer>s =new ArrayList<>();
        List<List<Integer>> ll=new ArrayList();


        count(candidates, target,s,ll,0);
        return ll;


    }
    public static void count(int a[],int amount, List<Integer>s,List<List<Integer>>ll,int indx)
    {
        if(amount==0)
        {
            ll.add(new ArrayList<>(s));
            return ;
        }

        for(int i=indx;i<a.length;i++)
        {
            int y=a[i];

            if(amount>=y)
            {
                s.add(y);
            
            count(a,amount-y,s,ll,i);
            s.remove(s.size()-1);
            }

        }
        
    }
    
}