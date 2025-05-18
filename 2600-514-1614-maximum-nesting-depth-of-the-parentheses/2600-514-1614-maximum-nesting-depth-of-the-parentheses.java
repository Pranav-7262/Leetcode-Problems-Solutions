class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int depth  = Integer.MIN_VALUE;
        for(char ch:s.toCharArray()){
            if(ch == '(') {
                stack.push(ch);
            }
            else if(ch == ')') {
                stack.pop();
            }
            depth = Math.max(depth,stack.size());
        }
        return depth == Integer.MIN_VALUE ? 0 : depth;
    }
}