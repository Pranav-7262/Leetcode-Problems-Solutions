class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int s = 0;
        int res = 0;
        int currSum = 0;
        for(int e=0;e<nums.length;e++) {
            while(set.contains(nums[e])) {
                set.remove(nums[s]);
                currSum -= nums[s];
                s++;
            }
            currSum += nums[e];
            set.add(nums[e]);
            res = Math.max(res , currSum);
        }
        return res;
    }
}