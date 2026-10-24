class Solution {
    public int peakValleyDifference(int[] nums) {
     int sum1 = 0, sum2 = 0;
     int n = nums.length;
     for(int i=1;i<n-1;i++) {
        if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
            sum1 += nums[i];
        }
        else if(nums[i] < nums[i-1] && nums[i] < nums[i+1]){
            sum2 += nums[i];
        }
     }
     return sum1 - sum2;   
    }
}