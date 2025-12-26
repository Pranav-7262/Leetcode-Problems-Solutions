class Solution {
    public int minChanges(int n, int k) {
       if ((k & ~n) != 0) {
        return -1;
    }
        return Integer.bitCount(n ^ k);
    }
    
}
