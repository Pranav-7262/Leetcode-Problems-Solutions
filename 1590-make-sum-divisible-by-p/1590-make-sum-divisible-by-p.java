class Solution {
    public int minSubarray(int[] nums, int p) {
         int res = nums.length;
         long totalSum = 0;
    
        for(int num : nums) {
            totalSum += num;
        }
        int target = (int)(totalSum % p);

        if (target == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 

        long prefix = 0;
        for(int i=0;i<nums.length;i++) {
            prefix = (prefix + nums[i]) % p;
            int need = (int)((prefix - target + p) % p);
            if(map.containsKey(need)) {
                res = Math.min(res, i - map.get(need));
            }
            map.put((int)prefix, i);
        }
        return res == nums.length ? -1 : res;
    }
}