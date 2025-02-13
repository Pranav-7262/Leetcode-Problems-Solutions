class Solution {
    public int firstMissingPositive(int[] arr) {
          int cnt = 1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]==cnt){
                cnt++;
            }
        }
        return cnt;
    
    }
}