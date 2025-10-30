class Solution {
    public int findShortestSubArray(int[] nums) {
    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer, Integer> first = new HashMap<>();
    HashMap<Integer, Integer> last = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int val = nums[i];
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        if (!first.containsKey(val)) {
            first.put(val, i);
        }
        last.put(val, i);
    }
    int degree = Collections.max(freq.values());
    int minLen = Integer.MAX_VALUE;

    for (int num : freq.keySet()) {
        if (freq.get(num) == degree) {
            int length = last.get(num) - first.get(num) + 1;
            minLen = Math.min(minLen, length);
        }
    }

    return minLen;
    }
}