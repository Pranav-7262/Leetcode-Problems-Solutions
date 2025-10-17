class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]%2 ==0 && nums[i] <= threshold) {
                int end = i+1;
                while(end < n && nums[end] <= threshold && nums[end]%2 != nums[end-1] % 2) {
                    end++;
                }
                len = Math.max(len , end-i);
            }
        }
        return len;
    }
}