class Solution {
    public int centeredSubarrays(int[] nums) {
        int count =0;
        int n = nums.length;

        for(int i=0;i<n;i++) {
            int sum = 0;
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++) {
                sum +=  nums[j];
                set.add(nums[j]);
                if(set.contains(sum)) {
                    count++;
                }
            }
        }
        return count;
    }
}