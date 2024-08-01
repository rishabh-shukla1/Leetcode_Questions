class Solution {
    public int countSeniors(String[] details) {

            int c=0;
        for(int i=0;i<details.length;i++)
        {
            String s=details[i];
            String w=s.substring(11,13);
            int n=Integer.parseInt(w);

            if(n>60)
            c++;
        }

        return c;
        
    }
}