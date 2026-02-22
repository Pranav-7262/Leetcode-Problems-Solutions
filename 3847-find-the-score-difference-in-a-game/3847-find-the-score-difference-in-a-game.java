class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        boolean active = true;
        int activeC = 0, inactiveC = 0;
        for(int i=0;i<n;i++){
            if(nums[i] % 2 != 0) {
                active = !active; 
            }
            if(i % 6 == 5) {
                active = !active;
            }
            if(active) {
                activeC += nums[i];
            }else {
                inactiveC += nums[i];
            }
        }
        return activeC - inactiveC;
    }
}