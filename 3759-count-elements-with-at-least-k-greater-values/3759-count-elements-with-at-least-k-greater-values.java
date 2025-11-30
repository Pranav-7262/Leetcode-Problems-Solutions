class Solution {
    public int countElements(int[] nums, int k) {
       if(k == 0) return nums.length;
       int n =nums.length;
        Arrays.sort(nums);
        int count = 0;
       for (int i = 0; i < n; i++) {
        int j = upperBound(nums, nums[i]);
        if (n - j >= k) count++;
    }

    return count;
    }
    private static int upperBound(int []nums , int target) {
        int left = 0 , right = nums.length ;
        while(left < right) {
            int mid = left + (right - left) / 2;
           if (nums[mid] <= target) left = mid + 1;
           else right = mid;
        }
        return left;
    }
}