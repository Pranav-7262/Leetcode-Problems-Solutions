class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1) {
                    int ans =dfs(i , j, grid);
                    max = Math.max(max , ans);
                }
            }
        }
        return max;
    }
    private static int dfs(int r,int c, int [][]arr) {

        int n = arr.length;
        int m = arr[0].length;

        if (r < 0 || r >= n ||
                c < 0 || c >= m ||
                arr[r][c] == 0) {
            return 0;
        }
        arr[r][c] = 0;

        int area = 1;
        area += dfs(r-1,c,arr);
        area += dfs(r,c+1,arr);
        area += dfs(r,c-1,arr);
        area += dfs(r+1,c,arr);


        return area;
    }
}