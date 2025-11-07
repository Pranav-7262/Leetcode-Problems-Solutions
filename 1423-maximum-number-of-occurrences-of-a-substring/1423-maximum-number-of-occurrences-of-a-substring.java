class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int left = 0, maxFreq = 0;
        HashMap<String,Integer> string = new HashMap<>();
        HashMap<Character,Integer> chars = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            chars.put(c, chars.getOrDefault(c, 0) + 1);
            if (i - left + 1 > minSize) {
                char leftChar = s.charAt(left);
                chars.put(leftChar, chars.get(leftChar) - 1);
                if (chars.get(leftChar) == 0) {
                    chars.remove(leftChar);
                }
                left++;
            }
            if (i - left + 1 == minSize && chars.size() <= maxLetters) {
                String sub = s.substring(left, i + 1);
                string.put(sub, string.getOrDefault(sub, 0) + 1);
                maxFreq = Math.max(maxFreq, string.get(sub));
            }

        }
        return maxFreq;
    }
}