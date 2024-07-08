class Solution {
    public boolean wordPattern(String pattern, String s) {

        String a[]=s.split(" ");


        if(a.length!=pattern.length())
        return false;


        Map b=new HashMap();

        for(Integer i=0;i<pattern.length();i++)
        {
            if(b.put(a[i],i)!=b.put(pattern.charAt(i),i))
            return false;
            
        }

        return true;

        
        
    }
}