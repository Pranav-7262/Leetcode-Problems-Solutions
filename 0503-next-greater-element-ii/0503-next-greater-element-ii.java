class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int []arr = new int[n];
        Arrays.fill(arr, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<2*n;i++) {
            while(!stack.isEmpty() && nums[stack.peek() % n] < nums[i % n]) {
                arr[stack.pop() % n] = nums[i % n];
            }
            stack.push(i % n);
        }
        return arr;
    }
}