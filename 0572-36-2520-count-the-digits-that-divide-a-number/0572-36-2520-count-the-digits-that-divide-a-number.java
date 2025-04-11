class Solution {
    public int countDigits(int num) {
        int count = 0;
        int t = num;
        while(t != 0) {
            int n = t%10;
            if(n!=0) {
                if(num % n == 0){
                count++;
            }
          }
          t /= 10;
        }
        return count;
    }
}