class Solution {
    public boolean validPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;
        while(a<=b){
            if(s.charAt(a) == s.charAt(b)){
                a++;
                b--;
            }
            else return isPalindrome(s,a+1,b)||isPalindrome(s,a,b-1);
        }
        return true;
    }
    public boolean isPalindrome(String s, int a, int b){
        while(a<=b){
            if(s.charAt(a)==s.charAt(b)){
                a++;
                b--;
            }
            else return false;
        }
        return true;            
    }
    
}