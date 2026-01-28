class Solution {
    public int majorityElement(int[] nums) {
          int n = nums.length;
          int count = 0;
          int var = 0;

          for(int num : nums) {
             if(count == 0) {
                var = num;
            }
            if(num == var) {
                count++;
            }else{
                count--;
               
            }
          }
          return var;
    }
}