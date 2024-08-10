class Solution {
    public int regionsBySlashes(String[] grid) {
        // grid = { "/" }
        // arr = {0 0 1,
        //        0 1 0,
        //        1 0 0}

        // grid = { "\" }
        // arr = {1 0 0,
        //        0 1 0,
        //        0 0 1}
        int n = grid.length;
        int[][] arr = new int[n*3][n*3];
        // Expanding the grid
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i].charAt(j)=='/'){
                    arr[i*3][j*3+2] = arr[i*3+1][j*3+1] = arr[i*3+2][j*3] = 1; 
                } else if(grid[i].charAt(j)=='\\'){
                    arr[i*3][j*3] = arr[i*3+1][j*3+1] = arr[i*3+2][j*3+2] = 1;
                }
            }
        }
        // Counting regions
        int regions=0;
        for(int i=0;i<n*3;i++){
            for(int j=0;j<n*3;j++){
                if(arr[i][j]==0){
                    dfs(i,j,arr);
                    regions++;
                }
            }
        }
        return regions;
    }
    private void dfs(int i,int j, int[][]arr){
        if(i<0 || i>=arr.length || j<0 || j>= arr.length || arr[i][j]==1) return;
        arr[i][j]=1;
        dfs(i-1,j,arr);
        dfs(i+1,j,arr);
        dfs(i,j-1,arr);
        dfs(i,j+1,arr);
    }
}