class Solution {
    public List<List<Integer>> subsets(int[] arr) {
         int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        int subsets = 1 << n;  // 2 ^ n
        for (int i = 0; i < subsets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0){
                        list.add(arr[j]);
                    }
            }
            ans.add(list);
        }
        return ans;
    }
}