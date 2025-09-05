class Solution {
    public String kthLargestNumber(String[] nums, int k) {
          Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            } else {
                return b.compareTo(a); 
            }
        });
        return nums[k - 1];
    }
}