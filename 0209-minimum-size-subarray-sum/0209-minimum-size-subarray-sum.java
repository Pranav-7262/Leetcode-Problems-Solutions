class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength =Integer.MAX_VALUE;
        int left = 0;
        int val_sum = 0;
        for(int i=0;i<nums.length;i++){
            val_sum += nums[i];

            while(val_sum>=target){
                minlength = Math.min(minlength,i-left+1);
                val_sum -= nums[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;

    }
}