class Solution {
    public int minOperations(int[] nums, int k) {
        int op = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int diff = xor ^ k;
        while(diff > 0) {
            diff = diff & diff-1;
            op++;
            diff = diff >> 1;
        }
        return op;
    }
}
// 1000
// 0111