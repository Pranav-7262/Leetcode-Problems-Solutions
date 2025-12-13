class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int xor = 0;
        for(int val : nums) {
            if(set.contains(val)) {
                 xor ^= val;
            }else {
            set.add(val);
            }
        }
        return xor;
    }
}