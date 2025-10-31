class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int n = nums.length;
      int []res = new int[2];
      int c=0;
      for(int i=0;i<n;i++) {
         for(int j=i+1;j<n;j++) {
           if(nums[i] == nums[j]) {
             res[c++] = nums[i];
             break;
           }
       }
      }
      return res;
    }
}