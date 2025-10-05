class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int n = arr.length;
        int sum = 0;
        int count = 0;
        for (int end = 0; end < n; end++) {
            sum+= arr[end];
            if (end >= k-1) {

                if (sum >= k * threshold) {
                    count ++;
                }
                sum -= arr[end-k+1];
            }
        }
        return count;
     
    }
}