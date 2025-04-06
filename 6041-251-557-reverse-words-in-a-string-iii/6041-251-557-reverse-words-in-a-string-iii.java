class Solution {
    public String reverseWords(String s) {
        String []words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word:words){
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            res.append(reversed).append(" ");
        }
        return res.toString().trim();
    }
}