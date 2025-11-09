class Solution {
    public int minMoves(int[] nums) {
        int maxi = Integer.MIN_VALUE , moves = 0;
        for(int num : nums) {
            maxi = Math.max(maxi , num);
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != maxi) {
                moves += maxi - nums[i];
            }
        }
        return moves;
    }
}