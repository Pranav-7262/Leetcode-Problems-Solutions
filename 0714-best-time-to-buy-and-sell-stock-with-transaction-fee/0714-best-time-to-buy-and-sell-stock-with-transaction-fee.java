class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int pro = 0 , fees = prices[0];
        for(int i=1;i<n;i++) {
            pro = Math.max(pro , prices[i] - fees - fee);
            fees = Math.min(fees ,prices[i] - pro);
        }
        return pro;
    }
}