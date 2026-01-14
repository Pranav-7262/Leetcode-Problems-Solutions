class Solution {
    public int maxChunksToSorted(int[] arr) {
     Stack<Integer> stack = new Stack<>();

     for(int num : arr) {
        if(stack.isEmpty() || num >= stack.peek()) {
            stack.push(num);
        }
        else {
            int max = stack.pop();
            while(!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }
            stack.push(max);
        }
     }
     return stack.size();        
    }
}