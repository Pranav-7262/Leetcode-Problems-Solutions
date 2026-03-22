class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for(int i=0;i<nums.length;i++) {
             long curr = nums[i];
            while(!stack.isEmpty() && curr == stack.peek()) {
                curr += stack.pop();
            }
            stack.push(curr);
        }
        return new ArrayList<>(stack);
    }
}