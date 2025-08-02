class Solution {
    public int maxProductDifference(int[] nums) {
        int p = 0;
        Arrays.sort(nums);
        int p1 = nums[0] * nums[1];
        int p2 = nums[nums.length-1] * nums[nums.length-2];
        p = Math.abs(p1 - p2);

        return p;

    }
}