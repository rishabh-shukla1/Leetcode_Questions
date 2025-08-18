class Solution {
    public List<List<String>> solveNQueens(int n) {

        char ch[][]=new char[n][n] ;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ch[i][j]='.';
            }
        }

        List<List<String>> l=new ArrayList<>();

        find(ch,0,n,l);

        return l;

    }

    public static void find(char b[][],int row, int q,List<List<String>>l){

        if(q==0)
        {
            List<String> t=new ArrayList<>();
            for(int i=0;i<b.length;i++)
            {
                String s=new String(b[i]);
                t.add(s);
            }
            l.add(t);

            return ;

        }

        for(int col=0;col<b.length;col++)
        {

            if(safe(b,row,col))
           {
            b[row][col]='Q';
            find(b,row+1,q-1,l);
            b[row][col]='.';
           }

        }

    }
    public static boolean safe(char b[][],int row , int col){

        int r=row;
        while(r>=0)
        {

            if(b[r][col]=='Q'){
                return false;
            }
            r--;

        } 

        r=row;
        int c=col;

        while(r>=0 && c>=0)
        {
            if(b[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
         r=row;
         c=col;

        while(r>=0 && c<b.length)
        {
            if(b[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;

        }


        return true;

       


    }
}