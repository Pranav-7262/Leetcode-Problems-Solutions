class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int f =0;
        int l = n-1;
        int []ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] % 2 ==0){
                ans[f] = nums[i];
                f++; 
            } else {
                ans[l] = nums[i];
                l--;
            }
        }
    
        return ans;
    }
}