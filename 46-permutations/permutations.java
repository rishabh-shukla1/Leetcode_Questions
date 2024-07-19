class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>l = new ArrayList<>();
        List<List<Integer>>ll=new ArrayList<>();
        
        calculate(nums,l,ll);

        return ll;
        
    }

    public static void calculate(int a[],List<Integer>l,List<List<Integer>>ll)
    {

        if(l.size()==a.length)
        {
            ll.add(new ArrayList<>(l));
            return ;
        }


        


        for(int i=0;i<a.length;i++)
        {
            if(l.contains(a[i]))
            continue;
          
            l.add(a[i]);
            calculate(a,l,ll);
            l.remove(l.size()-1);
            
        }
    

    }
}