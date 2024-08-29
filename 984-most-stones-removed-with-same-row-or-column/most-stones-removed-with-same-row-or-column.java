class Solution {
    public int removeStones(int[][] stones) {


        HashSet<int[]>h=new HashSet<>();
        int is=0;
        for(int s[]:stones)
        {
            if(!h.contains(s))
            {
                dfs(s,h,stones);
                is++;
            }
        }


        return stones.length-is;


        
    }

    public static void dfs(int s[],HashSet<int[]>h,int stone[][])
    {

        h.add(s);

        for(int st[]:stone)
        {
            if(!h.contains(st))
            {
                if(s[0]==st[0] || s[1]==st[1])
                {
                    dfs(st,h,stone);
                }
            }
        }
    }
}