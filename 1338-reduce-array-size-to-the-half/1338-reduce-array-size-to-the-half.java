class Solution {
    public int minSetSize(int[] arr) {
       int n = arr.length;
       int mini = Integer.MAX_VALUE;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num:arr) {
        map.put(num , map.getOrDefault(num,0)+1);
       }
       List<Integer> list = new ArrayList<>(map.values());
       Collections.sort(list , Collections.reverseOrder());
 
      int removed = 0;
      int count = 0;
      for(int val : list) {
        removed += val;
        count++;
        if(removed >= n/2) {
            return count;
        }
      }
       return mini;
    }
}
