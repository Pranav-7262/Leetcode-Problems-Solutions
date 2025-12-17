class Solution {
    public int largestCombination(int[] candidates) {
        int n = candidates.length;
         int  ans = 0;
       for(int bit=0;bit<32;bit++) {
          int count = 0;
        for(int i=0;i<n;i++) {
            if((candidates[i] & (1 << bit)) != 0) {
                count++;
            }
        }
        ans = Math.max(ans , count);
       }
       return ans;
    }
}
