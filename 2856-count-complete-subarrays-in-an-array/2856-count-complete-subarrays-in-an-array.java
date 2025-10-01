class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int totalcount = set.size();
        int count = 0 , n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i;j<n;j++){
                seen.add(nums[j]);
                if(seen.size() == totalcount) {
                    count += n - j;
                    break;
                }
            }
        }
        return count;
    }
}