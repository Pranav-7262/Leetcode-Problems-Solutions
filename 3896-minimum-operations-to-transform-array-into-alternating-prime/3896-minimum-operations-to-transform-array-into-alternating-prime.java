class Solution {
    public int minOperations(int[] nums) {
        int op = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (!isPrime(nums[i])) {
                    int target = nextPrime(nums[i]);
                    op += (target - nums[i]);
                }
            } else {
                if (isPrime(nums[i])) {
                    int target = nextNonPrime(nums[i]);
                    op += (target - nums[i]);
                }
            }

        }
        return op;
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int nextPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    public int nextNonPrime(int num) {
        while (isPrime(num)) {
            num++;
        }
        return num;
    }

}