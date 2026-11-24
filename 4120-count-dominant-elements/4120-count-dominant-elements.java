class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int cnt = 0;
        if(nums[0] >= nums[1]){
            cnt++;
        }
        if(nums[n-1] >= nums[n-2]) {
            cnt++;
        }
        for(int i=1;i<n-1;i++) {
              long sum = (long) nums[i-1] + nums[i+1];
            long avg = (sum + 1) / 2;
            if(avg <= nums[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}

