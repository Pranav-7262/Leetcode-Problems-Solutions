class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int []arr = new int[n+1];
        int start = 0 , end = n;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == 'D'){
                arr[i] = end--;
            } else{
                arr[i] = start++;
            }
        }
     arr[n] = end;
     return arr;
    }
}