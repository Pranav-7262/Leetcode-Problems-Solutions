class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int s = 0;
        int sum = 0 , maxSum = Integer.MIN_VALUE;
        int e = n-1;
        while(s < e) {
            sum = nums[s] + nums[e];
            maxSum = Math.max(maxSum , sum);
            s++;
            e--;
        }
        return maxSum;
    }
}
