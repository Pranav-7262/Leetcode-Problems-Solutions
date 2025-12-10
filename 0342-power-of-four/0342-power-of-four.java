class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0 || (n & (n - 1)) != 0)
            return false;
        return (n & 0xAAAAAAAA) == 0; 
    }
}