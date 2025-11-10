class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> q = new Stack<>();
        int op = 0;
        for(int val : nums){
            while(!q.isEmpty() && q.peek() > val) {
                q.pop();
            }
              if (val > 0 && (q.isEmpty() || q.peek() < val)) {
                  q.push(val);
             op++;
            }
        }
        return op;
    }
}