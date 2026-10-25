class Solution {
    public int calculateScore(int a, int b) {
        int s1 = count(a);
        int s2 = count(b);
        return s1 >= s2 ? s1*s2 : s2/s1;
    }

    private int count(int n) {
        int cnt=0;
        while(n > 0) {
             if( (n & 1 ) == 1) cnt++;   
            n = n >> 1;
        }
        return cnt;
    }
}