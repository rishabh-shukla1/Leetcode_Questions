class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

         List<Integer> s=new ArrayList<>();
         List<List<Integer>>ll =new ArrayList();

        count (candidates,target,s,ll,0);

        return ll;

        

        
    }

    public static void count(int[]candidates,int amount,List<Integer> s
    ,List<List<Integer>>ll,int indx)
    {
        if(amount==0)
        {
            ll.add(new ArrayList<>(s));
            return;
        }

    
    for(int i=indx;i<candidates.length;i++)
    {
        if(i>indx && candidates[i]==candidates[i-1])
        continue;

        if(amount>=candidates[i])
        {

        s.add(candidates[i]);

        count(candidates,amount-candidates[i],s , ll,i+1);
        s.remove(s.size()-1);
        }

    }
    }
}