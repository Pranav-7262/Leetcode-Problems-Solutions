class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
       for(int num : nums) set.add(num);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int maxi =1;
        int cnt= 1;
       for(int num : list) {
         if(set.contains(num + 1 )){
            cnt++;
            maxi = Math.max(cnt , maxi);
        }
        else {
            cnt = 1;
        }
    }
        return maxi;
}
}