class Solution {
    public int maxFreqSum(String s) {
        int maxV = 0;
        int maxS = 0;
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonant = new HashMap<>();
         for(char ch : s.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                vowel.put(ch ,vowel.getOrDefault(ch , 0)+1);
            } else {
                consonant.put(ch , consonant.getOrDefault(ch , 0)+1);
            }
         }
        for(int val : vowel.values()) {
            maxV = Math.max(maxV , val);
        }
        for(int val : consonant.values()) {
            maxS = Math.max(maxS , val);
        }
        return maxV + maxS;
    }
}