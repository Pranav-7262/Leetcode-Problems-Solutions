class Solution {
    public int maximumPossibleSize(int[] nums) {
        int c = 0;
        int s = nums[0]; 
        for(int num:nums) {
            if(num >= s){
                c++;
                s = num;
            }
        }
        return c;
    }
}