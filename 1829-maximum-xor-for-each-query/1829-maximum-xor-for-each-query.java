class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int [] ans = new int[n];
        int maxVal = (1 << maximumBit) - 1;
        int total = 0;
        for(int num : nums) {
            total ^= num;
        }
       for(int i=0;i<n;i++) {
        ans[i] = total ^ maxVal;
        total ^= nums[n -1 -i];
       }
       return ans;
    }
}