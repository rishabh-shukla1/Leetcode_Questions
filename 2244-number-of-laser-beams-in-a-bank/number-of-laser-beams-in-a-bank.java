class Solution {
    public int numberOfBeams(String[] bank) {

         int a[]=new int [bank.length];

         for(int i=0;i<a.length;i++)
         {  int c=0;
            String w=bank[i];
            for(int j=0;j<w.length();j++)
            {
                if(w.charAt(j)=='1')
                c++;
            }
            a[i]=c;
         }
         
         for(int i=0;i<a.length;i++)
         {
            System.out.println(a[i]);
         }
         int c=a[0];
         int sum=0;
         for(int i=1;i<a.length;i++)
         {
            if(c==0)
            {
                c=a[i];
                continue;
            }

            if(a[i]>0)
            {
                sum=sum+(a[i]*c);
                c=a[i];

            }

            
         }


         return sum;
        
    }
}