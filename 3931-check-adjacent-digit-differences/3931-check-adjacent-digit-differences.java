class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1;i<s.length();i++) {
            int diff = Math.abs((
                s.charAt(i) - '0') - (s.charAt(i-1) - '0'));
            if(diff > 2) {
                return false;
            } 
        }
        return true;
    }
}