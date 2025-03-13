class Solution {
    public int[] sortArray(int[] nums) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums){
            pq.add(i);
        }
        int i =0;
        while(!pq.isEmpty()){
            nums[i++] = pq.poll();
        }
        return nums;
      }
}
