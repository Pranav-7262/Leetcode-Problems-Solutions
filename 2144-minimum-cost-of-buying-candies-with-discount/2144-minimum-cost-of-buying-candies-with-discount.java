class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int limit = 2;
        int sum = 0;
        for(int i=n-1;i>=0;i--) {
            if(limit == 0) {
                limit = 2;
                continue;
            }
            sum += cost[i];
            limit--;
        }
        return sum;
    }
}