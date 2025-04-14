class Solution {
    public int smallestEvenMultiple(int n) {
         int m = Integer.MAX_VALUE;
        for(int i=1;i<=m;i++){
            if(i%n==0 && i%2==0)
            return i;
        }
        return 0;
    }
}