class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
      
        int n = groupSizes.length;
         List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++) {

            map.putIfAbsent(groupSizes[i] , new ArrayList<>());
            map.get(groupSizes[i]).add(i);
            
            if(map.get(groupSizes[i]).size() == groupSizes[i] ) {
                ans.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
            }
            
    }
    return ans;
}
}