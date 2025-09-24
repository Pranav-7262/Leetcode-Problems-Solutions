class Solution {
    public long maxTotalValue(int[] nums, int k) {
      int n = nums.length;
       int mini = Integer.MAX_VALUE;
       int maxi = Integer.MIN_VALUE;
    

         for(int i=0;i<n;i++) {
           mini = Math.min(mini,nums[i]);
           maxi = Math.max(maxi ,nums[i] );
           
      }
        return (long) (maxi-mini)*k;
    }
}