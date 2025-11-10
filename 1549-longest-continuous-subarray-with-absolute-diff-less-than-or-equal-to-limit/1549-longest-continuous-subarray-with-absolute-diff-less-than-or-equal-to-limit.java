class Solution {
    public int longestSubarray(int[] arr, int x) {
         int n = arr.length;
		TreeMap<Integer ,Integer> map = new TreeMap<>();
		int start = 0 , ans =0;

		for(int end=0;end<n;end++) {
			map.put(arr[end] , map.getOrDefault(arr[end] ,0)+1);

			while(map.lastKey() - map.firstKey() > x) {
				map.put(arr[start] , map.get(arr[start])-1);
				if(map.get(arr[start]) == 0) map.remove(arr[start]);
				start++;
			}
			ans = Math.max(ans,end-start+1);
		}
		return ans;
    
    }
}