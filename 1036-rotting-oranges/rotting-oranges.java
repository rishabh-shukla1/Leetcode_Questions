class Solution {


    class Pair{
        int row;
        int col;
        int maxtime;

        Pair(int row,int col,int maxtime)
        {
            this.row=row;
            this.col=col;
            this.maxtime=maxtime;

        }

    }
    public int orangesRotting(int[][] grid) {

    int vis[][]=new int[grid.length][grid[0].length];
    Queue<Pair> q=new LinkedList<>();
    int fresh=0;

    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==2)
            {
                q.add(new Pair(i,j,0));
                vis[i][j]=2;
            }
           if(grid[i][j]==1)
           {
            fresh++;

           }

        }
    }
    int cnt=0;

    int dr[]={-1,0,1,0};
    int dc[]={0,1,0,-1};

    int time=0;


    while(!q.isEmpty())
    {
        int r=q.peek().row;
        int c=q.peek().col;
        int mt=q.peek().maxtime;

        time=Math.max(time,mt);

        q.remove();

        for(int i=0;i<4;i++)
        {
            int ri=dr[i]+r;
            int ci=dc[i]+c;

            if(ri>=0 && ci>=0 && ri<grid.length && ci<grid[0].length && vis[ri][ci]!=2 && grid[ri][ci]!=0)
            {

                q.add(new Pair(ri,ci,mt+1));

                vis[ri][ci]=2;
                cnt++;

            }
        }
    }

    if(cnt!=fresh)
    {
        return -1;
    }

    return time;

        
    }
}