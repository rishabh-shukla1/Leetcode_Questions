class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {

                    if(find(board,word,i,j,0))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
        
    }

    public static boolean find(char board[][],String word,int i, int j, int k)
    {

         if(k==word.length())
        {
            return true;
        }

        if(i<0 || j<0 || i>=board.length|| j>=board[0].length ||word.charAt(k)!=board[i][j])
        {

            return false ;

        }

       

         char ch=word.charAt(k);


         board[i][j]='*';



     boolean found=find(board,word,i+1,j,k+1)||find(board,word,i-1,j,k+1)||find(board,word,i,j+1,k+1)||find(board,word,i,j-1,k+1);

        board[i][j]=ch;



        return found;

     

    }
}