class Solution {
    public int maxSum(int[] nums) {
        int maximum = 0;
        int ans = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        for(int num : set) {
           if (num > 0) ans += num;
        }
        if(ans == 0){
            ans = Collections.max(set);
        }
        return ans;
    }
}