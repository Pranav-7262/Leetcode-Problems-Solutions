class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] pright = new int[n];
        int[] pleft = new int[n];
        int[] answer = new int[n];

        pleft[0] = 0;

        for (int i = 1; i < n; i++) {
            pleft[i] = pleft[i - 1] + nums[i-1];
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += nums[i];
        }
        pright[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            pright[i] = pright[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(pleft[i] - pright[i]);
        }

        return answer;

    }

}
