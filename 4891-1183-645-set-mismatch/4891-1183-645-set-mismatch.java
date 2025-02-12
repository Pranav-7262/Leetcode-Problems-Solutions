class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int duplicate = 0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length;i++){
        if(map.get(nums[i])>1){
            duplicate = nums[i];
            break;
         }
         
        }
        int miss = 0;
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                miss = i;
                break;
            }
        }
        return new int[] {duplicate,miss};
    }
}