class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    long sum = dfs(i, j, grid);
                    if (sum % k == 0) {
                        cnt++;
                    }
                }
            }
        }
        return (int)cnt;
    }

    private static long dfs(int r, int c, int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        if (r < 0 || r >= n ||
                c < 0 || c >= m ||
                arr[r][c] == 0) {
            return 0;
        }
        long sum = arr[r][c];
        arr[r][c] = 0;
        sum += dfs(r - 1, c, arr);
        sum += dfs(r, c + 1, arr);
        sum += dfs(r, c - 1, arr);
        sum += dfs(r + 1, c, arr);

        return sum;
    }
}