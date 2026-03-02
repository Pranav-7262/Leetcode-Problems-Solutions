class Solution {
    public int minIncrementForUnique(int[] arr) {
         Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        int max = arr[0];
       
        for(int i=1;i<n;i++) {
              int num = arr[i];
            if(num <= max) {
                count += max-num+1;
                max++;
            }
            else {
                max = num;
            }
        }
        return count;
    }
}