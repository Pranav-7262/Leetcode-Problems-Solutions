class Solution {
    public int dominantIndex(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        int idx = 0;
        int max = Integer.MIN_VALUE;
     
        for(int i=0;i<n;i++){
           if(max < nums[i]){
            max= nums[i];
            idx = i;
           }
        }
         for(int i=0;i<n;i++){
                if(nums[i] == max) continue;
                if(nums[i] * 2 > max)  return -1;
            }

            return idx;
    }
}