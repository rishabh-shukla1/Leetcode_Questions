class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
           int ans=0;
         int i=0;
         int j=tokens.length;
         int a=0;
        while(i<j)
        {
            if(tokens[i]<=power)
            {
                System.out.println(power);
                ans++;
                
                power=power-tokens[i];
                i++;
                a=Math.max(a,ans);
            }
            else
            {
                if(ans>0)
                {
                    ans--;

            
                j--;
                power=power+tokens[j];
                }
                else
                {
                    break;
                }
            
            
                



            }

        }
        

        return a;
        
    }
}