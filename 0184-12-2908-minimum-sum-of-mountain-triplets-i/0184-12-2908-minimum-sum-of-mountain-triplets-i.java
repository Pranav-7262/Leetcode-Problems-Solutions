class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;
        boolean found = false;
         for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                   if (nums[i] < nums[j]) {
                for (int k=j+1;k<n;k++){
                   if(nums[k] < nums[j]){
                           int sum = nums[i] + nums[j] + nums[k];
                            minSum = Math.min(minSum, sum);
                            found = true;
                   }
                }
            }
         }
        
      }
      return found ? minSum : -1;
   }
}