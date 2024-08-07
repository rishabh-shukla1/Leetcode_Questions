class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack <Integer> s=new Stack<>();
        int a[]=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++)
        {
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i])
            {
                int indx=s.peek();
                s.pop();
                a[indx]=i-indx;

            }

            s.push(i);
        }

        return a;
        
    }
}