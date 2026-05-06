class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int []ans = new int[n];
        Arrays.fill(ans , -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!stack.empty() && prices[i] <= prices[stack.peek()]) {
                ans[stack.pop()] = i;
            }
            stack.push(i);
        }
         for(int i=0;i<n;i++) {
            if(ans[i] == -1) {
                ans[i] = prices[i];
            }else {
                ans[i] = prices[i] - prices[ans[i]];
            }
         }
         return ans;
    }
}