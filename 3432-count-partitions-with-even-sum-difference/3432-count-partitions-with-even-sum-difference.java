class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int sum = 0 , count = 0;
        int newSum = 0;
        for(int x : nums) {
            sum += x;
        }
        for(int i=0;i<n-1;i++) {
             newSum += nums[i];
             sum -= nums[i];
            if(Math.abs(newSum - sum) % 2 == 0) {
                count++;
            }
            
        }
        return count;
    }
}