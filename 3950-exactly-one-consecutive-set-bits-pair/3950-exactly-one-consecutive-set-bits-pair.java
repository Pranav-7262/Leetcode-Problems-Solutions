class Solution {
    public boolean consecutiveSetBits(int n) {
        int prev = 0 , cnt = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                if(prev == 1) {
                    cnt++;
                }
            }
            prev = (n & 1);
            n = n >> 1;
        }
        return cnt == 1;
    }
}