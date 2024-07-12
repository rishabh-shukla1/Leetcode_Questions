class Solution {
    public int maximumGain(String st, int x, int y) {


        char a='a';
        char b='b';

        int ans=0;

        if(y>x)
        {
            a='b';
            b='a';


        }


        Stack<Character> s=new Stack<>();


        for(char ch:st.toCharArray())
        {
            if(!s.isEmpty() && ch==b && s.peek()==a)
            {
                ans=ans+Math.max(x,y);
                s.pop();
            
            }
             else
            {
            s.push(ch);
            }
        }

       

       
        char r='b';
        char p='a';

        if(y>x)
        {
            r='a';
            p='b';
        }


        Stack <Character> w= new Stack<>();
        while(!s.isEmpty())
        {
            if(!w.isEmpty() && w.peek()==p && s.peek()==r)
            {
                ans=ans+Math.min(x,y);
                w.pop();
                s.pop();

            }
            else
            {
                w.push(s.pop());
            }
        }


        return ans;

        
    }
}