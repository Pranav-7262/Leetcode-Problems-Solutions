class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) maxi = Math.max(maxi, num);
        int left = 0;
        long maxoccred = 0;
        long res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxi) {
                maxoccred++;
            }
            while(maxoccred>=k){
                 if(nums[left]==maxi)   maxoccred--;
                 left++;
         }
         res += left;
        }
        return res;
    }
}