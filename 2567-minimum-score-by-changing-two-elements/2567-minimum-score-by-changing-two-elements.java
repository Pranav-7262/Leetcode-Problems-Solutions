class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int ans = Math.min(Math.min(nums[n-1] - nums[2] , nums[n-3] - nums[0]) ,nums[n-2] -nums[1]);
        return ans;
    }
}

// 1 4 5 7 8

// 1 3 4