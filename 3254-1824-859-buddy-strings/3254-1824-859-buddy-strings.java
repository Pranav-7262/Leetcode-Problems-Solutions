class Solution {
    public boolean buddyStrings(String str, String goal) {
           if (str.length() != goal.length()) {
            return false;
        }
        if (str.equals(goal)) {
            int[] frequency = new int[26];
            for (char ch : str.toCharArray()) {
                frequency[ch - 'a']++;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        int f = -1;
        int s = -1;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != goal.charAt(i)) {
                if (f == -1) {
                    f = i;
                } 
                else if (s == -1) {
                    s = i;
                } 
                else {
                    return false;
                }
            }
        }
        if (s == -1) {
            return false;
        }
        boolean ans = str.charAt(f) == goal.charAt(s) && str.charAt(s) == goal.charAt(f);
        return ans;
    }
}
    