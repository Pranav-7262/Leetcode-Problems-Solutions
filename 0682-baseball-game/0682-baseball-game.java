class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for (int val : stack) {
            sum += val;
        }
        return sum;
    }
}
