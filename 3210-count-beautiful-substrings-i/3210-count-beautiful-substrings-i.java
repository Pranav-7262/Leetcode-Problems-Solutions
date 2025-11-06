class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length() , beautiful = 0;
        for(int i=0;i<n;i++) {
            int vowel = 0 , consonant = 0;
            for(int j=i;j<n;j++) {
                if(isVowel(s.charAt(j))) vowel++;
                else consonant++;

                if (vowel == consonant && (vowel * consonant) % k == 0) {
                    beautiful++;
                }
            }
        }
        return beautiful;
    }
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}