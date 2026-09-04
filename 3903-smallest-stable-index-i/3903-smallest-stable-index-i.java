class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] max = new int[n];        
        int [] min = new int[n];
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            maxi = Math.max(maxi, nums[i]);
            max[i] = maxi;
        }
        for(int i=n-1;i>=0;i--) {
            mini = Math.min(mini, nums[i]);
            min[i] = mini;
        }
        for(int i=0;i<n;i++) {
            int diff = max[i] - min[i];
            if(diff <= k) {
                return i;
            }
        }
        return -1;        
    }
}
