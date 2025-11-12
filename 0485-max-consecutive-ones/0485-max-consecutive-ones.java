class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n = nums.length;
     int currcnt = 0;
     int maxcnt = 0;
     for(int i=0;i<n;i++){
        if((nums[i]==1)){
            currcnt++;
            maxcnt = Math.max(maxcnt,currcnt);
        }
        else {
            currcnt=0;
        }
     }
     return maxcnt;   
    }
}