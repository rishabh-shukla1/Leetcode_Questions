class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
 Arrays.sort(hand);
   if(hand.length%groupSize!=0) return false;

 TreeMap<Integer,Integer> t=new TreeMap<>();

 for(int i=0;i<hand.length;i++)
{
    t.put(hand[i],t.getOrDefault(hand[i],0)+1);



}

while(!t.isEmpty())
{
    int key=t.firstKey();
    for(int i=key;i<key+groupSize;i++)
    {
        if(!t.containsKey(i)) return false;
        int v=t.get(i);

        if(v==1) t.remove(i);
        else t.put(i,v-1);


    }
}


return true;




        
        
    }
}