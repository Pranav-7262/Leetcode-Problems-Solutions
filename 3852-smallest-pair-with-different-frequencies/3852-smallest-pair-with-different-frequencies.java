class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums == null || nums.length == 0) {
        return new int[]{-1, -1};
    }
       int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
            if(!map.get(list.get(i)).equals(map.get(list.get(j)))) {
                 return new int[]{list.get(i), list.get(j)};
            }
        }
        }
         return new int[]{-1 , -1};
    }
}