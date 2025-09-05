class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        for(int num : nums){
            moves += Math.abs(num-median);
        }
        return moves;
    }
}