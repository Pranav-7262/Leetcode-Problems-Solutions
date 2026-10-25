class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0 && visited[i][j] == 0 && dfs(i, j, n, m, grid, visited)) {

                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean dfs(int x, int y, int n, int m, int[][] grid, int[][] visited) {

        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (grid[x][y] == 1 || visited[x][y] == 1) {
            return true;
        }

        visited[x][y] = 1;

        boolean up = dfs(x - 1, y, n, m, grid, visited);
        boolean down = dfs(x + 1, y, n, m, grid, visited);
        boolean left = dfs(x, y - 1, n, m, grid, visited);
        boolean right = dfs(x, y + 1, n, m, grid, visited);

        return up && down && left && right;
    }

}