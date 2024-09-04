class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        Set<String> h=new HashSet<>();

        int d[][]={{0,1},{1,0},{0,-1},{-1,0}};

        for(int i=0;i<obstacles.length;i++)
        {
            h.add(obstacles[i][0]+","+obstacles[i][1]);
        }

        int x=0;
        int y=0;
        int ans=0;
        int dis=0;


        for(int i=0;i<commands.length;i++)
        {
            if(commands[i]==-1)
            {
                dis=(dis+1)%4;

            }
            else if(commands[i]==-2)
            {
                dis=(dis+3)%4;
            }
            else
            {
                for(int j=0;j<commands[i];j++)
                {
                    int nx=x+d[dis][0];
                    int ny=y+d[dis][1];
                    if(h.contains(nx+","+ny))
                    {
                    break;
                    }

                    x=nx;
                    y=ny;


                ans=Math.max(ans,x*x+y*y);
                }
                
            }
        }

        return ans;
        
    }
}