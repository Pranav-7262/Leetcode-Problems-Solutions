class Solution {
    public int smallestNumber(int n) {
        int res = 0;
        for(int i=1;i<Integer.MAX_VALUE;i++) {
            if(Math.pow(2 , i) > n){
                res = (int) Math.pow(2,i);
                break;
            }
        }
        return res-1;
    }
}