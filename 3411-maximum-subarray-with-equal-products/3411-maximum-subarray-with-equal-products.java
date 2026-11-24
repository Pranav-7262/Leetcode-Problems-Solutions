class Solution {
    public int maxLength(int[] nums) {
        int maxi = 0;
        int maxVal = 0, allLcm = 1;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
            allLcm = lcm(allLcm, x);
        }
        int limit = allLcm * maxVal;
        int s = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int pro = 1, g = 0, l = 1;

            for (int j = i; j < n; j++) {
                pro *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (pro == g * l) {
                    maxi = Math.max(maxi, j - i + 1);
                }
                if (pro > limit)
                    break;
            }
        }
        return maxi;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
