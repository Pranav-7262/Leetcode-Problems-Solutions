class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int MOD = 1_000_000_007;
        
        for(int [] arr : queries) {
            int idx = arr[0];
            int v = arr[arr.length-1];
            int lim = arr[1];
            if(v == 1) continue;
             while (idx <= lim) {
                nums[idx] = (int)((1L * nums[idx] * v) % MOD);
                idx += arr[2];
            }
        }
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
        }
        return xor;

    }
}