class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int maxiIndx = -1;
        for(int i=0;i<n;i++) {
            if(maxi <= nums[i]) {
                maxi = nums[i];
                maxiIndx = i;
            }
        }
        long leftS = 0;
        long rightS = 0;
        for(int i=0;i<n;i++) {
         if (i <= maxiIndx) {
            leftS += nums[i];
            }
          if(i >= maxiIndx) {
                rightS += nums[i];
            }
        }
        if(leftS > rightS) return 0;
        else if(leftS < rightS) return 1;
        else return -1;
    }
}