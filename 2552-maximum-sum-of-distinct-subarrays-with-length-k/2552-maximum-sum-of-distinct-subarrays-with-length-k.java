class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
       int n =arr.length;
       long maxS = 0;
       int s = 0;
       long sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

       for(int e =0;e<n;e++) {
        sum += arr[e];
        map.put(arr[e] , map.getOrDefault(arr[e],0)+1);

        if(e-s+1 == k) {
          if (map.size() == k) {
            maxS = Math.max(maxS, sum);
        }
        
      map.put(arr[s] , map.get(arr[s]) - 1);
       if(map.get(arr[s]) == 0) {
        map.remove(arr[s]);
       }
       sum = sum - arr[s];
       s++;
       }
       
    }
     return maxS;
  }
}