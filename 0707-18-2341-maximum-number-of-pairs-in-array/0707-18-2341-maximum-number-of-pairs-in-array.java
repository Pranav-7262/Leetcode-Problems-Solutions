class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        int leftover = 0;
        int cnt = 0;
        for(int num:map.values()){
           cnt += num/2;
           leftover += num%2;
        }
        return new int[]{cnt,leftover};
    }
}