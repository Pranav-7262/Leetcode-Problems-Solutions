class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = -1;
        } 
        for(int i=0;i<n*2;i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]) {
                arr[stack.pop()] =   nums[i%n];
            }
            if(i < n) {
                stack.push(i);
            }
        }
        return arr;
    }
}