class Solution {
    public boolean isValid(String word) {
    
        if(word == null || word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(int i=0;i<word.length();i++) {
           if(!Character.isLetterOrDigit(word.charAt(i))) {
                return false;
           }
           if(isVowel(word.charAt(i))) {
            hasVowel =  true;
           } else if(Character.isLetter(word.charAt(i))) {
              hasConsonant = true;
           }
           
        }
        return hasConsonant && hasVowel;
    }
        public static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
      
}