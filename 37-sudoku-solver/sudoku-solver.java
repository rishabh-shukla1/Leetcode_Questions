class Solution {
    public void solveSudoku(char[][] board) {


        solve(board,0,0);
        
    }
    public static boolean solve( char b[][],int row , int col){

        if(col==9)
        {
            col=0;
            row++;
        }

        if(row==9)
        {
            return true;
        }

        if(b[row][col]!='.')
        {
            return solve(b,row,col+1);
        }
        else{

            for(char ch='1';ch<='9';ch++){

                if(safe(b,row,col,ch)){
                
                b[row][col]=ch;

                  if(solve(b,row,col+1))
                  {
                    return true;
                  }

                  b[row][col]='.';
                }


            }
        }

        return false;
       

    }
    public static boolean safe(char b[][], int row, int col , char ch){

        for(int i=0;i<9;i++)
        {
            if(b[row][i]==ch)
            {
                return false;
            }
        }

        for(int i=0;i<9;i++)
        {
            if(b[i][col]==ch)
            {
                return false;
            }
        }

         row=row-row%3;
         col=col-col%3;

        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(b[i][j]==ch)
                {
                    return false;

                }

            }
        }

        return true;

    }
}