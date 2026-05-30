class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int left = 0;
        int right = n-2;
        int ans = 0;
        while(left < right) {
           ans += piles[right];
           right -= 2;
           left++;
        }
        return ans;
    }
}
 