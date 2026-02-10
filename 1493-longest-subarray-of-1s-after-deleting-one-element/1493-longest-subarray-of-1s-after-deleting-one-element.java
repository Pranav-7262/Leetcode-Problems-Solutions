class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int count = 0;
        int zeros = 0;
        int n = nums.length;
        int maxC = 0;

        for(int right=0;right<n;right++) {
            if(nums[right] == 0) {
                zeros++;
            }
            while(zeros > 1) {
                if(nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
                count = right - left;
                maxC = Math.max(maxC , count);
        }
        return maxC;
    }
}