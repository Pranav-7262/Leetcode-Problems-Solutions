class Solution {
    public int jump(int[] nums) {
        int ans = 0;
       int currEnd = 0 , farIndex = 0;
        for(int i=0;i<nums.length-1;i++) {
           farIndex = Math.max(farIndex ,nums[i] + i);
            if(i == currEnd) {
                ans++;
                currEnd = farIndex;
           }
        }
        return ans;
    }
}