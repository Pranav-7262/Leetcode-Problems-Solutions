class Solution {
    public boolean canJump(int[] nums) {
        int maxi = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(i > maxi){
                return false;
            }
            maxi= Math.max(maxi ,nums[i]+i);
        }
        return true;
    }
}