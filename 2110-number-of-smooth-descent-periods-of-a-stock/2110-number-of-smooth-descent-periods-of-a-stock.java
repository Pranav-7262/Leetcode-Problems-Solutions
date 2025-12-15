class Solution {
    public long getDescentPeriods(int[] prices) {
        long total = 1;
        long curr_length = 1;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] == prices[i-1] -1) {
                curr_length += 1;
            }else {
                curr_length = 1;
            }
            total += curr_length;
        }
        return total;
    }
}