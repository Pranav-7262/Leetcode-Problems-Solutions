class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int median = -1;
        if(n % 2 == 1) {
            median = nums[n/2];
        }else {
            int sum = nums[n/2] + nums[ (n/2) - 1];
            median = sum / 2;
        }
        int ans = 0;
        for(int num : nums) {
            ans += Math.abs(num - median);
        }
        return ans;
    }
}

