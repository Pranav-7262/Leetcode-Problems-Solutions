class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length , minimized = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            if(nums[i] == target) {
               minimized = Math.min(minimized , Math.abs(i - start)); 
            }
        }
        return minimized;
    }
}