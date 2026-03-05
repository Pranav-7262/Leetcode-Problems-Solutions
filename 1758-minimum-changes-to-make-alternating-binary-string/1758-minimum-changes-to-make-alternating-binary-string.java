class Solution {
    public int minOperations(String s) {
        int n = s.length() , count = 0;
         for(int i=0;i<n;i++) {
            char expected;
            if(i % 2 == 0) {
                expected = '0';
            }else {
                 expected = '1';
            }
            if(s.charAt(i) != expected) {
                count++;
            }
         }
         int cb = n - count;
         return Math.min(cb , count);
    }
}