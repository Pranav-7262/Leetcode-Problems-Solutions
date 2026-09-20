class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;
        int cnt = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.max(intervals[i][0], intervals[j][0]) <= Math.min(intervals[i][1], intervals[j][1])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}