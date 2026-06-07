class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int left = Math.max(1 ,n - k);
        int right = n + k;
        int sum = 0;

        for(int i=left;i<=right;i++) {
            if(Math.abs(n - i) <= k && (n & i) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}