class Solution {
    public int finalElement(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        maxi = Math.max(nums[0] , nums[nums.length -1]);
        return maxi != Integer.MIN_VALUE ? maxi : -1;
    }
}
