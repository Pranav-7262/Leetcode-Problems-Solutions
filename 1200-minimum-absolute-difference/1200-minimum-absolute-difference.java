class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> answer = new ArrayList<>();
        int minD = Integer.MAX_VALUE;
        for(int i=1;i<n;i++) {
            minD = Math.min(minD , arr[i] - arr[i-1]);
        }

         for(int i=1;i<n;i++) {
            List<Integer> list = new ArrayList<>();
            if(arr[i] - arr[i-1] == minD) {
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
            if(list.size() > 1) answer.add(list);
         }
         return answer;
    }
}
