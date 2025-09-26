class Solution {
    public int triangleNumber(int[] arr) {
         int n = arr.length;
        Arrays.sort(arr);
        int c = 0;

        for (int i = 0; i < n - 2; i++) {
            int k = i + 1;
            for (int j = i + 2; j < n; j++) {
                while (k < j && arr[i] + arr[k] <= arr[j]) {
                    k++;
                }
                if (k < j) {
                    c += (j - k);
                }
            }
        }
        return c;
    
    }
}