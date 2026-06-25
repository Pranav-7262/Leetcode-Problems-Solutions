class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tG = 0;
        int tC = 0;
        for (int i = 0; i < n; i++) {
            tG += gas[i];
            tC += cost[i];
        }
        if (tC > tG) {
            return -1;
        }
        int ans = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += gas[i] - cost[i];
            
            if (curr < 0) {
                ans = i +1;
                curr = 0;
            }
        }
        return ans;
    }
}