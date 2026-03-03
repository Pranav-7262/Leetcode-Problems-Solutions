class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        int start = 0, maxlen = 0;
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);

            while(map.get(nums[i]) > k) {
                map.put(nums[start] ,map.getOrDefault(nums[start],0)-1);
                start++;
            }
            maxlen = Math.max(maxlen , i - start + 1);

        }
        return maxlen;

    }
}