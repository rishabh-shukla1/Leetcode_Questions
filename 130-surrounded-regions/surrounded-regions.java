class Solution {

   
    public void solve(char[][] board) {


        

        for(int i=0;i<board.length;i++)
        {

            if(board[i][0]=='O')
            {
                find(i,0,board);
            }

            if(board[i][board[0].length-1]=='O')
            {
                find(i,board[0].length-1,board);
            }
        }


        for(int j=0;j<board[0].length;j++)
        {

            if(board[0][j]=='O')
            {
                find(0,j,board);
            }

            
            if(board[board.length-1][j]=='O')
            {
                find(board.length-1,j,board);
            }

           
        }
           for(int i=0;i<board.length;i++)
           {

             for(int j=0;j<board[0].length;j++){


                if(board[i][j]=='T')
                {
                    board[i][j]='O';
                }
                else if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }



             }

           }

        
    


        
    }

    public static void find(int i,int j , char a[][])
    {

         if(i<0 || j<0 ||i>=a.length || j>=a[0].length|| a[i][j]!='O')
        {
            return ;
        }

        a[i][j]='T';

        find(i+1,j,a);
        find(i-1,j,a);
        find(i,j+1,a);
        find(i,j-1,a);


    }
}