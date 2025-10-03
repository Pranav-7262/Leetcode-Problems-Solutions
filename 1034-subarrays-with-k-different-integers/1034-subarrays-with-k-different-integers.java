class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
         return countK(arr , k) - countK(arr , k-1);
    }
  private static int countK(int []arr , int k) { 
      
      if(k <0)  return 0;
      Map<Integer,Integer> map = new HashMap<>();
      int start = 0;
      int count = 0;
      
      for(int end=0;end<arr.length;end++) {
          map.put(arr[end],map.getOrDefault(arr[end],0)+1);
          
          while(map.size() > k) {
               map.put(arr[start],map.getOrDefault(arr[start],0)-1);
               if(map.get(arr[start]) == 0) {
                   map.remove(arr[start]);
               }
               start++;
          }
          
              count += end-start+1;
          
      }
      return count;
  }
}