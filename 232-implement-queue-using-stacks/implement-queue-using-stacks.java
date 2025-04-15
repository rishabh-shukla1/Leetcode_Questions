class MyQueue {


    Stack<Integer> in;

    Stack<Integer> out;



    public MyQueue() {


        in=new Stack<>();

        out=new Stack<>();
        
    }
    
    public void push(int x) {

        in.push(x);
        
    }
    
    public int pop() {

        if(out.isEmpty())
        {
            change(out,in);
        }

        return out.pop();
        
    }
    
    public int peek() {

        if(out.isEmpty())
        {
            change(out,in);
        }

        return out.peek();
        
    }
    
    public boolean empty() {

        return in.isEmpty()  && out.isEmpty();
        
    }

    public void change( Stack<Integer> out ,Stack<Integer> in)
    {

        while(!in.isEmpty())
        {
            out.push(in.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */