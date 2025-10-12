class Solution {
    public int longestSubarray(int[] nums) {
         int n = nums.length;
        int maxlen = 2; 

        for (int end = 0; end < n-2; end++) {
            int a = nums[end];
            int b = nums[end+1];

            int len = 2;
            for (int j = end+2; j < n; j++) {
                if (a + b == nums[j]) {
                    len++;
                    a = b;
                    b = nums[j];
                } else {
                    break;
                }
            }
            maxlen = Math.max(maxlen , len);
        }
        return maxlen;
    }
}