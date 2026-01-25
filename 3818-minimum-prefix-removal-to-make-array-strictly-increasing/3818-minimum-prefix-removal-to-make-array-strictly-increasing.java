class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;

        int sl = n-2;
        while(sl >= 0 && nums[sl] < nums[sl+1]) {
            sl--;
        }
        return sl+1;
    }
}