class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int l = s1.length();
        int m = s2.length();

        if (l > m) return false; // If s1 is bigger than s2, return false directly
        
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Store frequency of s1 in map
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int window = l;

        // Store first window frequency in map2
        for (int i = 0; i < window; i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // Compare both hashmaps
        if (map.equals(map2)) return true;

        // Sliding Window Starts
        for (int i = window; i < m; i++) {
            // Add current character to window
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);

            // Remove leftmost character from window
            char left = s2.charAt(i - window);
            if (map2.get(left) == 1) {
                map2.remove(left);
            } else {
                map2.put(left, map2.get(left) - 1);
            }

            // Compare both hashmaps
            if (map.equals(map2)) {
                return true;
            }
        }
    
    return false;
}
}