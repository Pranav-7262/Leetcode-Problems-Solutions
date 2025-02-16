class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0;
        // for(int num:nums){
        //     if(i<2 || num!=nums[i-2]){
        //         nums[i++] = num;
        //     }
        // }
        // return i;
        int k = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}