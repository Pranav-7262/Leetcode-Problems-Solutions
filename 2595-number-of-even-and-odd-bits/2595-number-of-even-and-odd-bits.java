class Solution {
    public int[] evenOddBit(int n) {
        int [] ans = new int[2];
        int even = 0 , odd = 0;
        int idx = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                if((idx & 1) == 1) {
                    odd++;
                }else {
                    even++;
                }   
            }
            n = n >> 1;
            idx++;
        }
        return new int[]{even , odd};
    }
}