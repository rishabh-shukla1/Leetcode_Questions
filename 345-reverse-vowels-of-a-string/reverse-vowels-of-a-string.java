class Solution {
    public String reverseVowels(String s) {

        List<Character> c=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o' ||ch=='u'||ch=='A' || ch=='E'|| ch=='I'||ch=='O' ||ch=='U')
            {
                c.add(ch);
            }
        }

        Collections.reverse(c);

        String w="";

        

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o' ||ch=='u'||ch=='A' || ch=='E'|| ch=='I'||ch=='O' ||ch=='U')
             {
               char h=c.get(0);
                w=w+h;
                c.remove(0);
             }
             else
             {
                w=w+s.charAt(i);
             }
            
        }

     

        return w;


        
    }
}