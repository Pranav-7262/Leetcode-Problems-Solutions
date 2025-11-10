class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> q = new ArrayDeque<>();
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