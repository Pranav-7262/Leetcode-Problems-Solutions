class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        List<Integer> list  = new ArrayList<>(set);
          Collections.sort(list, Collections.reverseOrder());
       
        int size = Math.min(k, list.size());
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}