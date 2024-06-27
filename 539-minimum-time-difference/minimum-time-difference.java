class Solution {
    public int findMinDifference(List<String> timePoints) {
    int a[]=new int[timePoints.size()];
    for(int i=0;i<timePoints.size();i++)
    {
        String w=timePoints.get(i);
        
        int  h1=Integer.parseInt(w.substring(0,2));
        int  m1=Integer.parseInt(w.substring(3,5));
       

        a[i]=(h1*60)+m1;





        

        

        
    }   


    Arrays.sort(a);

    int c=a[a.length-1]-a[0];

    if(c>720)
    c=1440-c;
    for(int i=0;i<a.length-1;i++)
    {
        int t=a[i+1]-a[i];

        if(t>720)
        {
            t=1440-t;
        }
        if(c>t)
        {
            c=t;
        }

    }

    return c;
        
    }
}