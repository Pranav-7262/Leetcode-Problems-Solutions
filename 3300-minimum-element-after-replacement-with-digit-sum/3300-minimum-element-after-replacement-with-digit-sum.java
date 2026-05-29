class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
        for(int num : nums) {
            int sum = 0;
            while(num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            mini = Math.min(mini , sum);
        }
        return mini;
    }
}