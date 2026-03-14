class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int len = nums.length;
        int ans = 0;
        int sum = 0;
        
        for(int i=0;i<len;i++){
             sum += nums[i];
             if(map.containsKey(sum-goal)){
                ans += map.get(sum-goal);
             }
             map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}