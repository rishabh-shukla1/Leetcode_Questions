class KthLargest {

    PriorityQueue<Integer> p=new PriorityQueue<>();

    private int k;

    public KthLargest(int k, int[] nums) {

        this.k=k;

        for(int i:nums) add(i);


        
    }
    
    public int add(int val) {

        p.add(val);

        if(p.size()>k)
        {
            p.poll();
        }

        return p.peek();

        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */