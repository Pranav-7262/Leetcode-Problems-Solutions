class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int []left = new int[n];
        left[0] = 1;
        set.add(nums[0]);
        for(int i=1;i<n;i++) {
            set.add(nums[i]);
            left[i] = set.size();
        }
        set.clear();
        int []right = new int[n];
        right[n-1] = 0;
        for(int i=n-2;i>=0;i--) {
            set.add(nums[i+1]);
            right[i] = set.size();
        }
        int []ans = new int[n];
        for(int i=0;i<n;i++) {
            ans[i] = left[i] - right[i];
        }
        return ans;
    }
}
// 1 2 3 4 5
// // 4 3 2 1 0
//  1 2 2 3 3
//  3 3 2 1 0
// 1 1 1 1 2
// 2 2 2 1 0