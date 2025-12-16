class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or = 0;
        for(int val : nums) {
            if((val & 1) != 1) {
                or |= val;
            }
        }
        return or;
    }
}