class Solution {
    public int maxArea(int[] arr) {
          int start = 0;
        int end = arr.length-1;
        int maxi = 0;
        while(start < end) {
            int w = end-start;
            int h = Math.min(arr[start],arr[end]);
            int curr = w*h;
            maxi = Math.max(maxi,curr);
            if(arr[start] < arr[end]) {
                start++;
            } else{
                end--;
            }
        }
        return maxi;
    }
}