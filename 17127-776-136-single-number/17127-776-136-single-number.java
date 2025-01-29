class Solution {
    public int singleNumber(int[] nums) {
        int n =nums.length;
        int value = 0;
        for(int i=0;i<n;i++){
            value = value^nums[i];
        }

        return value;
    }
}