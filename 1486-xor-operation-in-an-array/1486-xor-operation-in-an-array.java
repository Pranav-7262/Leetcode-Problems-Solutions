class Solution {
    public int xorOperation(int n, int start) {
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = start + (2*i);
        } 
        int xor = 0;
        for(int num : arr) {
            xor ^= num;
        }
        return xor;
    }
}