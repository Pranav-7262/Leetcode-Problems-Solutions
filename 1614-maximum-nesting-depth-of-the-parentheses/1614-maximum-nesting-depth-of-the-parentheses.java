class Solution {
    public int maxDepth(String s) {

        int depth  = Integer.MIN_VALUE;
        int cnt = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(') {
                cnt++;
            }
            else if(ch == ')') {
                cnt--;
            }
            depth = Math.max(depth,cnt);
        }
        return depth == Integer.MIN_VALUE ? 0 : depth;
    }
}