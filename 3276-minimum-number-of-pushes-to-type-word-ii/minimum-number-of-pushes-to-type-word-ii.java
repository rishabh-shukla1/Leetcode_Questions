class Solution {
    public int minimumPushes(String word) {

        int a[]=new int[26];

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            a[ch-'a']++;
        }
        int ans=0;

        Arrays.sort(a);
        int count=0;

        for(int i=25;i>=0;i--)
        {
            if(a[i]>0)
            ans=ans+a[i]*(count++/8 +1);
        }


        return ans;


        
    }
}