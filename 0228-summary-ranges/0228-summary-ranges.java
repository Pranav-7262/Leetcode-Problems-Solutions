class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
         if (nums == null || nums.length == 0) {
            return list;
        }
        int start = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[i - 1] + 1){
               addRange(list, start, nums[i - 1]);
               start = nums[i];
           }
        }
        addRange(list, start, nums[nums.length - 1] );
        return list;
    }
 private void addRange(List<String> list, int start, int end) {
        if (start == end) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + end);
        }
    }
}