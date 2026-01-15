class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = 1;
        }
        for(int i=1;i<n;i++) {
            if(ratings[i] > ratings[i-1]) {
                arr[i] = arr[i-1] + 1;
            }
        }
         for(int i=n-2;i>=0;i--) {
             if(ratings[i] > ratings[i+1]) {
                arr[i] = Math.max(arr[i] , arr[i+1] + 1);
            }
        }
        int total = 0;
        for(int num : arr) {
            total += num;
        }
        return total;
    }
}