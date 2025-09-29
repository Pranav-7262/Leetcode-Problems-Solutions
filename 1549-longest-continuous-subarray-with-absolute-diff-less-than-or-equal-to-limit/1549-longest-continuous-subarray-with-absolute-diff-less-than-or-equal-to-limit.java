class Solution {
    public int longestSubarray(int[] arr, int x) {
         int n = arr.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int s = 0 , e = 0 , maxlen = 0 ,bestS = 0;
        
        while(e < n) {
            map.put(arr[e] , map.getOrDefault(arr[e],0)+1);
            
            while(map.lastKey() - map.firstKey() > x){
                 map.put(arr[s] , map.getOrDefault(arr[s],0)-1);
                 if(map.get(arr[s]) == 0){
                     map.remove(arr[s]);
                 }
                 s++;
            }
            if(e-s+1 > maxlen){
                maxlen = e-s+1;
                bestS = s;
            }
            e++;
        }
         ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < maxlen; i++) {
            list.add(arr[bestS + i]);
        }
        return list.size();
    
    }
}