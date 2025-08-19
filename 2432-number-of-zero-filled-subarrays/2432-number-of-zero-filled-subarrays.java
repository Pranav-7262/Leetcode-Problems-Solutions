class Solution {
    public long zeroFilledSubarray(int[] arr) {
      long c = 0 , res = 0;
      for(int num:arr){
        if(num == 0){
            c++;
            res += c;
        } else {
            c = 0;
        }
      }
     return res;
    }
}