class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int ori = n;
        while(n > 0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }
        char [] a = String.valueOf(sum).toCharArray();
        char [] b = String.valueOf(ori).toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a , b);
    }
    private int fact(int n) {
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
}