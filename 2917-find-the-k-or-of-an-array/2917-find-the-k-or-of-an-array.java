class Solution {
    public int findKOr(int[] nums, int k) {
        int ans=0;
        for(int bit=0;bit<32;bit++) {
            int count = 0;
            int mask = 1 << bit;

            for(int num : nums) {
                if((num & mask) == mask) {
                    count+=1;
                }
            }
            if(count >= k) {
                ans |= mask;
            }
        }
        return ans;
    }
}