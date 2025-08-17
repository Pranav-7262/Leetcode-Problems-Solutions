class Solution {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int sum = 0;
        
        for(int num : nums) {
            sum += num;
            minSum = Math.min(minSum,sum);
        }
        return 1-minSum;
    }
}