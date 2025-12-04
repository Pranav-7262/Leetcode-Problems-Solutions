class Solution {
    public int maximumScore(int a, int b, int c) {
        int sum= a+b+c;
        int max = Math.max(a,Math.max(b,c));
        if(max>sum-max) {
            return sum-max;
        }
        else return sum/2;
    }
}