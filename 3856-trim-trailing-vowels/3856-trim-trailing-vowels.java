class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
         int i = n - 1;
     while (i >= 0 && isVowel(s.charAt(i))) {
        i--;
    }

    return s.substring(0, i + 1);
    }
    private static boolean isVowel(Character ch) {
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
    }
}