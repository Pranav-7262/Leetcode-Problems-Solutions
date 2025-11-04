class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int []ans = new int[n-k+1];

        HashMap<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int idx = 0;
        for(int i=0;i<n;i++) {
            map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);

            if(i -start+1 == k) {
                List<int[]> list = new ArrayList<>();
                for(Map.Entry<Integer,Integer> e : map.entrySet()) {
                    list.add(new int[]{e.getKey() ,e.getValue()});
                }
                 list.sort((a, b) -> {
                    if (b[1] != a[1]) return b[1] - a[1];
                    return b[0] - a[0];
                });
                int sum = 0;
                int count = 0;
                for(int [] p : list) {
                    sum += p[0] * p[1];
                    count++;
                    if(count == x) break;
                }
                ans[idx++] = sum;
                 int out = nums[start];
                if (map.get(out) == 1) map.remove(out);
                else map.put(out, map.get(out) - 1);

                start++;

            }
        }
        return ans;
    }
}