class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int maximum = 0;

       for(int i=0;i<n/2;i++) {
         int sum = nums[i] + nums[n-1-i];
         maximum = Math.max(maximum , sum);
       }
       return maximum;
    }
}