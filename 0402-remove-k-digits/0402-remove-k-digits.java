class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(char ch : num.toCharArray()) {
            int n = ch - '0';
            while(!stack.isEmpty() && k>0 && stack.peek() > n) {
                stack.pop();
                k--;
            }
            stack.push(n);
        } 
        while(k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
    StringBuilder sb = new StringBuilder();
    for(int digit : stack) {
        sb.append(digit);
    }
        int index = 0;
        while(index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
      String res = sb.substring(index);
      return res.isEmpty() ? "0" : res;
    }
}