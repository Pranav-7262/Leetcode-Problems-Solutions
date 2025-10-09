class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int start = 0 , zeroCount = 0;
        int maxlen = -1;

        for(int end=0;end<n;end++) {
            if(nums[end] == 0){
                zeroCount++;
            }
        while(zeroCount > 1) {
              if(nums[start] == 0){
                zeroCount--;
            }
            start++;
        }
            maxlen = Math.max(maxlen , end-start);
        }
        return maxlen;
   }
}