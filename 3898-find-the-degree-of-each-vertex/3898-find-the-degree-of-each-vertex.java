class Solution {
    public int[] findDegrees(int[][] matrix) {
        int []ans = new int[matrix.length];
        int idx = 0;

        for(int []num : matrix) {
            int sum = 0;
            for(int n : num) {
                sum += n;
            }
            ans[idx++] = sum;
        }
        return ans;
    }
}