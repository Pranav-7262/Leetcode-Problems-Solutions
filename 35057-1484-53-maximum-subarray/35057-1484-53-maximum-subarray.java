class Solution {
    public int maxSubArray(int[] nums) {
         int n = nums.length;
        int sum = 0;
        int max_sum = nums[0];
        for (int i = 0; i < n; i++) {
            
            sum = sum + nums[i];
            if (max_sum < sum) {
                max_sum = sum;
            }

                if (sum < 0) {
                    sum = 0;
                }


        }
        return max_sum;
    }
}
