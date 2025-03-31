class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        int lefttotal = 0;
        for(int i=0;i<n;i++){
            int righttotal = sum - lefttotal - nums[i];
            if(righttotal == lefttotal) return i;
            lefttotal += nums[i];
        }
        return -1;
    }
}