class Solution {
    public void solve(char[][] board) {
         int n = board.length;
       int m = board[0].length;

        int [][]vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && vis[i][0] == 0) {
                dfs(i, 0, board, vis);
            }

            if (board[i][m - 1] == 'O' && vis[i][m - 1] == 0) {
                dfs(i, m - 1, board, vis);
            }
        }

        
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && vis[0][j] == 0) {
                dfs(0, j, board, vis);
            }

            if (board[n - 1][j] == 'O' && vis[n - 1][j] == 0) {
                dfs(n - 1, j, board, vis);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && vis[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
    private static void dfs(int r,int c,char[][]grid, int [][] vis) {
        int n= grid.length;
        int m=grid[0].length;
         if (r < 0 || c < 0 || r >= n || c >= m ||
            grid[r][c] == 'X' || vis[r][c] == 1) {
            return;
        }

        vis[r][c] = 1;

        dfs(r-1,c,grid,vis);
        dfs(r+1,c,grid,vis);
        dfs(r,c-1,grid,vis);
        dfs(r,c+1,grid,vis);

    }
}