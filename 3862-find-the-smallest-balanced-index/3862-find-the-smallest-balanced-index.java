class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n + 1];
        long sum = 0;
        for (int num : nums)  sum += num;
        arr[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0 && arr[i + 1] > sum / nums[i]) {
                arr[i] = sum + 1;
            } else {
                arr[i] = arr[i + 1] * nums[i];
            }
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {

            if (leftSum == arr[i + 1]) {
                return i;
            }
            leftSum += nums[i];

        }
        return -1;
    }
}