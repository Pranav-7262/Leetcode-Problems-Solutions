class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int n = len/2;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) {
                return num;
            }else {
                set.add(num);
            }
        }
        return -1;
    }
}