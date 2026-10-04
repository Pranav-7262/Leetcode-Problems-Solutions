class Solution {
    public int minRotations(String s) {
        int f = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i) - '0';
            int d = Math.abs(f - num);
            ans += Math.min(d , 10 - d);
            f = num;
        }
        return ans;
    }
}