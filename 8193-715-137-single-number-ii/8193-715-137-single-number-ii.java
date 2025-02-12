class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int num:nums) {
                hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}