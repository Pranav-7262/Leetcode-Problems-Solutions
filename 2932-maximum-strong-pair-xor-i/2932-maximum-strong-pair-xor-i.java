class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxXor = 0;
         for (int i = 0; i < n; i++) {
            for (int j = i;j < n && nums[j] <= 2 * nums[i]; j++) {
                maxXor = Math.max(maxXor , nums[i] ^ nums[j]);
            }
         }
         return maxXor;
    }
}
