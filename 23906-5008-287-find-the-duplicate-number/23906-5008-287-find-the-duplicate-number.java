class Solution {
    public int findDuplicate(int[] nums) {
        // int s=0;
        // int e=1;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[s]!=nums[e]){
        //         e++;
        //     }
        //     else{
        //         return nums[s];
        //     }
        // }
        // return nums[e-1];
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
             if(nums[i]==nums[i+1]){
               return nums[i];
           } 
        }
        return -1;
    }
}