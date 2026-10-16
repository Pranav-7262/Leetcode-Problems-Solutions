class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        char [][]vis = new char[n][m];
        int cnt = 0;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){  
            if(grid[i][j] == '1') {
                dfs(i , j, grid);
                cnt++;
            }
          }
        }
        return cnt;
    }
    private void dfs(int r,int c, char [][]arr) {

        int n = arr.length;
        int m = arr[0].length;
      
        if (r < 0 || r >= n ||
            c < 0 || c >= m ||
            arr[r][c] == '0') {
            return;
        }
          arr[r][c] = '0';
        dfs(r-1,c,arr);
        dfs(r,c+1,arr);
        dfs(r,c-1,arr);
        dfs(r+1,c,arr);
    }
}