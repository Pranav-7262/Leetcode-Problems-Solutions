class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int idx = -1;
        int minCapa = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(capacity[i] >= itemSize && capacity[i] < minCapa) {
                minCapa = capacity[i];
                idx = i;
            }
        }
        return idx;
    }
}