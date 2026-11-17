
class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] mat) {
         int n = mat.length;
        int m = mat[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int [][]vis = new int[n][m];
        int cntFresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    queue.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else {
                    vis[i][j] = 0;
                }
                if (mat[i][j] == 1) {
                    cntFresh++;
                }
            }
        }
        int time = 0;
        int []drow = {-1, 0,+1,0};
        int []dcol = {0,1,0,-1};
        int cnt  = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int r = p.row;
            int c = p.col;
            int t = p.time;

            time = Math.max(time,t);
            for (int i = 0; i < 4; i++) {
                int newRow = r + drow[i];
                int newCol = c+ dcol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && vis[newRow][newCol] != 2 && mat[newRow][newCol] == 1) {
                    queue.add(new Pair(newRow,newCol,time+1));
                    vis[newRow][newCol] = 2;
                    cnt++;
                }
            }

        }
        if (cntFresh != cnt) {
            return -1;
        }
        return time;
    }
}