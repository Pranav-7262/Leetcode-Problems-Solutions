class Solution {
    public int minRemoval(int[] nums, int k) {
        int count = 0;
        int left = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i] > (long)k*nums[left]) {
                left++;
            }
            count = Math.max(count, i - left + 1);
        }
        return n - count;
    }
}
