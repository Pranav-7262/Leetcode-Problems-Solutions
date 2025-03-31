class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int t = 0;
            for(int j=i;j<n;j++){
               t += arr[j];

               if((j-i+1) % 2 == 1){
                 ans += t;
               }
            }
           
        }
         return ans;
    }
}