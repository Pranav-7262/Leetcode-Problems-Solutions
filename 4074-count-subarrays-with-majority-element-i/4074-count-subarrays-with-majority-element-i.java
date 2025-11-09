class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0 , n = nums.length;
        for(int i=0;i<n;i++) {
            int currTarget = 0;
            int total = 0;

            for(int j=i;j<n;j++){
                if(nums[j] == target) currTarget++;
                total++;

                if( currTarget > total/2) count++;
            }
        }
        return count;
    }
}