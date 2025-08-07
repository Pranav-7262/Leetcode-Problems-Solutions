class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            for (int j = i + 1; j < s.length(); j++) {
                int b = s.charAt(j) - '0';
                max = Math.max(max, a * b);
            }
        }
        return max;
    }
}