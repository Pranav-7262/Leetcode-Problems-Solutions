class Solution {
    public int majorityElement(int[] nums) {
          int n = nums.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i:nums) {
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int half = n/2;
        for(int i:nums) {
            if (hm.get(i)>half){
                return i;
            }
        }
        return -1;
    }
}