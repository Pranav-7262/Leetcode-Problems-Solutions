class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int start = 1;
        int left = 0;
        for(int i=1;i<=n;i++) {
            
            total += start + left;
            left++;

            if (left == 7) {
                start++;
                left = 0;
            }
        }
        return total;

    }
}