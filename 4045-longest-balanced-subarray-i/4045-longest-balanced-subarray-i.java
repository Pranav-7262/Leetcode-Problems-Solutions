class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLength = 0 , length = 0;
        
        for(int i=0;i<n;i++) {
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();
            for(int j=i;j<n;j++) {
                if(nums[j] % 2 == 0) {
                     even.add(nums[j]);
                }else {
                     odd.add(nums[j]);
                }
                if (even.size() == odd.size()) {
                     length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
          }
        }
        return maxLength;
    }
}