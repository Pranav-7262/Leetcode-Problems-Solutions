class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> big = new ArrayList<>();
        for(int i=0;i<n;i++) {
            big.add(new ArrayList<>());
        }
        for(int []arr: pre) {
            big.get(arr[1]).add(arr[0]);
        }
        int []visit = new int[n];
        for(int i=0;i<n;i++) {
            if(visit[i] == 0) {
                if(dfs(i , big, visit) == true) {
                    return false;
                }
            }
        }
        return true;

    }
    private static boolean dfs(int node, List<List<Integer>> big, int []visit) {
        visit[node] = 1;
        for(int num : big.get(node)) {
            if(visit[num] == 1 ) {
                return true;
            }
            else if(visit[num] == 0) {
                if(dfs(num, big, visit) ){
                    return true;
                }
            }
        }
        visit[node] = 2;
        return false;

    }
}