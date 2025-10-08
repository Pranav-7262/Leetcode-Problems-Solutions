class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        int target = totalSum - x;
        int start = 0;
        int sum = 0;
        int maxlen = -1;

        for(int end=0;end<nums.length;end++) {

            sum += nums[end];
            while(sum > target && start <= end) {
                sum -= nums[start];
                start++;
            }
            if(sum == target) {
                maxlen = Math.max(maxlen , end-start+1);
            }
        }
        return  maxlen == -1 ? -1 : nums.length - maxlen;
    }
}