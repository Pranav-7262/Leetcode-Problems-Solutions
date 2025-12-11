class Solution {
    public int minOperations(int[] nums) {
        int k = 0;
  
        for(int i=0;i<=nums.length-3;i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                k++;
            }
        }
        for (int num : nums) {
            if (num == 0) return -1;
        }
        return k;
    }
}