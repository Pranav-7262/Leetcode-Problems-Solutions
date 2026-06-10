class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int rows = n/3;
        int idx = 0;
        int[][] ans = new int[rows][3];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<3;j++) {
                ans[i][j] = nums[idx++];
            }
        }
        for(int []arr : ans) {
            if(arr[arr.length - 1] - arr[0] > k) {
                return new int[][]{};
            }
        }
        return ans;
    }
}