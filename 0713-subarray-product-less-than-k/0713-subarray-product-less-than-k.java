class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int pro = 1;
        int count = 0;
        int start = 0;

        for(int end=0;end<nums.length;end++) {
            pro = pro*nums[end];

            while( pro >= k && start<=end) {
                pro /= nums[start];
                start++;
            }
            count += (end-start+1);
        }
        return count;
    }
}