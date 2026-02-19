class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int prevGroup = 0;
        int currGroup = 1;
        int result = 0;
        for(int i=1;i<n;i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                currGroup++;
            }else {
                result += Math.min(currGroup , prevGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }
         result += Math.min(currGroup , prevGroup);
         return result;
    }
}