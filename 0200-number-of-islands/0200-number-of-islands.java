class Solution {
    int rows=0,cols=0;
    public int numIslands(char[][] grid) {
         rows=grid.length;
         cols=grid[0].length;
        int count=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void DFS(char[][]grid,int i,int j){
        if(i<0 || i>=rows || j<0 || j>=cols){//out of bound case
            return;
        }
        if(grid[i][j]=='0' || grid[i][j]=='2'){
            return;
        }
        grid[i][j]='2';
        DFS(grid,i-1,j);
         DFS(grid,i,j+1);
          DFS(grid,i+1,j);
           DFS(grid,i,j-1);
    }
}