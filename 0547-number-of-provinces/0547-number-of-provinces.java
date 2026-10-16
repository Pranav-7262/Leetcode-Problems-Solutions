class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int[] vis = new int[V];
        int cnt = 0;

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                cnt++;
                dfs(i, isConnected, vis);
            }
        }

        return cnt;
    }

    private void dfs(int node, int[][] isConnected, int[] vis) {
        vis[node] = 1;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[node][j] == 1 && vis[j] == 0) {
                dfs(j, isConnected, vis);
            }
        }
    }
}