class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        int maxi = Integer.MIN_VALUE;
        for(int val : map.values()) {
            maxi = Math.max(maxi,val);
        }
        for(int num : nums){
            if(map.get(num) == maxi) {
                ans++;
            }
        }
        return ans;
    }
}