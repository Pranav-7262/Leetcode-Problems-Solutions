class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       int xor1 = 0;
       int xor2 = 0;
       for(int num : nums1) {
        xor1 ^= num;
       }
        for(int num : nums2) {
          xor2 ^= num;
       }
       int res = 0;
       if((nums2.length & 1) == 1){
        res ^= xor1;
       }
       if((nums1.length & 1) == 1){
        res ^= xor2;
       }
       return res;
    }
}

