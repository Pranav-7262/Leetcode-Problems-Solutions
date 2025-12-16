class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n-1;
        int or = 0;

         for (int num : nums) {
            or |= num;
        }
      return or * subsets;
    }
}
