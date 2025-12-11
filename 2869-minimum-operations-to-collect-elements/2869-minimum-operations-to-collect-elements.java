class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = nums.size();
       Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=n-1;i>=0;i--) {
           if(nums.get(i) <= k) {
            set.add(nums.get(i));
           }
            ans++;
           if(set.size() == k) {
            break;
           }
          
        }
        return ans;
    }
}