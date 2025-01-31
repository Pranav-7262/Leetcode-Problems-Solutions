class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = n*2;
        int []arr = new int[m];
        for(int i=0;i<n;i++) {
            arr[i] = nums[i];
        }
         for(int i=0;i<n;i++) {
            arr[i+n] = nums[i];
        }
        return arr;
    }
}