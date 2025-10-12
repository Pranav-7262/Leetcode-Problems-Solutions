class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n < 3) return n;
        int maxlen = 2;
        int curr = 2; 

        for (int end = 2; end < n; end++) {
           if(nums[end] == nums[end-1]+nums[end-2]) {
            curr++;
           }else {
            maxlen = Math.max(maxlen , curr);
            curr=2;
           }
        }
        maxlen = Math.max(maxlen , curr);
        return maxlen;
    }
}