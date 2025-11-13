class Solution {
    public void sortColors(int[] nums) {

     int n = nums.length , ones = 0 , zeros = 0 , twos =0;
     for(int i=0;i<n;i++) {
        if(nums[i] == 0) {
            zeros++;
        }
        else if(nums[i] == 1) ones++;
        else twos++;
     }    
      int idx = 0;
        while(zeros != 0){
            nums[idx++] = 0;
            zeros--;
        }
        while(ones != 0){
            nums[idx++] = 1;
            ones--;
        }
        while(twos != 0){
            nums[idx++] = 2;
            twos--;
        }
    }
}
