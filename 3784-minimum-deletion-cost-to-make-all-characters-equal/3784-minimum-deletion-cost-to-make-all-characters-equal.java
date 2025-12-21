class Solution {
    public long minCost(String s, int[] cost) {
       long ans = 0;
        int n = cost.length;
        Map<Character , Long> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            ans += cost[i];
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0L) + cost[i]);
        }
        long maxi = 0;
        for(long val : map.values()) {
            maxi = Math.max(maxi , val);
        }
        return ans - maxi;
    }
}