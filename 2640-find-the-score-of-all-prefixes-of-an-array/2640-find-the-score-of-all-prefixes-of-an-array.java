class Solution {
    public long[] findPrefixScore(int[] nums) {
        long []ans = new long[nums.length];
        long max = nums[0]; 
        ans[0]=nums[0]*2;
        for(int i=1;i<nums.length;i++) {
            max = Math.max(max, nums[i]);
            ans[i] = ans[i-1] + nums[i] + max;
        }
        return ans;
    }
}