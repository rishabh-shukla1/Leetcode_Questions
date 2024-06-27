class SmallestInfiniteSet {


    PriorityQueue<Integer> p;

   public SmallestInfiniteSet() {
    p=new PriorityQueue<>();

    for(int i=1;i<=1000;i++)
    {
        p.add(i);
    }
        
    }
    
    public int popSmallest() {

      return   p.poll();
        
    }
    
    public void addBack(int num) {

        if(!p.contains(num))
        {
            p.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */