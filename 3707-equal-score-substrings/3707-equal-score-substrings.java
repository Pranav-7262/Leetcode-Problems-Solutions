class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;
        int n = s.length();
        for(char c : s.toCharArray()) {
        total += (c - 'a' + 1);
      }
      int pre = 0;
     for(int i=0;i<n-1;i++) {
        pre += (s.charAt(i) - 'a' + 1);

        if(pre == total - pre) {
            return true;
        }
     }
     return false;
    }
}