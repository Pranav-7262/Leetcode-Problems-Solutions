class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        int n = nums.length;
        int k=0;

        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
        if (num != -1) {
            seen.add(num);
            k = 0;
        } else {
            k++;
            if (k > seen.size()) {
                ans.add(-1);
            } else {
                ans.add(seen.get(seen.size() - k));
            }
        }
       
    }
     return ans;
   }
}