class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int n = nums.length;
        int start = 0 , sum =0;

        for(int i=0;i<n;i++) {
            sum += nums[i];
            while(i-start+1 > k) {
                sum -= nums[start];
                start++;
            }
            if(i-start+1 == k) {
                avg = (double) sum / k; 
                maxAvg = Math.max(maxAvg , avg);
            }

        }
        return maxAvg;
    }
}