class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String a = s+s;
        return a.substring(1,a.length()-1).contains(s); 
    }
}