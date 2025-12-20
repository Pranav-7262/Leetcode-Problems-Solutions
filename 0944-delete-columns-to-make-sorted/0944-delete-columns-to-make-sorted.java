class Solution {
    public int minDeletionSize(String[] strs) {
        int n =  strs.length , count = 0;
        for(int i=0;i<strs[0].length();i++) {
            count += check(strs , i);
        }
        return count;
    }
    private static int check(String[] strs , int i) {
        for(int j=1;j<strs.length;j++) {
          if(strs[j].charAt(i) < strs[j - 1].charAt(i) ){
            return 1;
          }
    }
      return 0;
    }
}