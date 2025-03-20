class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }
        return true;
    }
}