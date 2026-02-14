class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
     
        for(int op=0;op<k;op++) {
             int min = 0;
            for(int i=1;i<n;i++){
               if(nums[i]<nums[min])   min = i;
              
            }
            nums[min] *= multiplier;
        }
        return nums;
    }
}