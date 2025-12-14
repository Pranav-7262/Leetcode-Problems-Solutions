class Solution {
    public int absDifference(int[] nums, int k) {
        if(k == nums.length) return 0;
        int diff = 0;
        int largeSum  = 0 , smallSum = 0;
        Arrays.sort(nums);
    
        for(int i=0;i<Math.min(k, nums.length);i++) {
          smallSum += nums[i];
        }
        for(int i=nums.length-1;i >= Math.max(nums.length - k, 0);i--) {
             largeSum += nums[i]; 

        }
        return Math.abs(largeSum - smallSum);
    }
}
// 2 2 4 5