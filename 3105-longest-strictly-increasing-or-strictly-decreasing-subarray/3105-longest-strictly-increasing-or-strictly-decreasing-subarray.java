class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        
        int maxiinc = 1;
        int maxidec = 1;
        int cnt = 1;

        for (int i = 0; i < n-1; i++) {
            if (nums[i] < nums[i + 1]) {
                cnt++;
                maxiinc = Math.max(maxiinc, cnt);
            } else {
                cnt = 1;
            }
        }
        cnt = 1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                maxidec = Math.max(maxidec, cnt);
            } else {
                cnt = 1;
            }
        }
        return Math.max(maxidec, maxiinc);
    }
}