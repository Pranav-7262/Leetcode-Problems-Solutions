class Solution {
    public int[] getNoZeroIntegers(int n) {
        int []ans = new int[2];
        for(int i=1;i<n;i++) {
            int a = i;
            int b = n-i;
            if(isNoZero(a) && isNoZero(b)){
               return new int[]{a,b};
            }   
        }
        return new int[0];
    }
    private boolean isNoZero(int num) {
        while(num > 0) {
            if(num % 10 == 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}