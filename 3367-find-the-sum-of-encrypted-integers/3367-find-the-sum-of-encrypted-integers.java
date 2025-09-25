class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int mes = 0;
        for(int i=0;i<nums.length;i++) {
          mes += encrypt(nums[i]);
        }
        return mes;
    }
    private static int encrypt(int num) {
        int original = num;
        int maxi = Integer.MIN_VALUE;
        while(num > 0) {
            int rem = num%10;
            maxi = Math.max(maxi , rem);
            num = num/10;
        }
       int digits = String.valueOf(original).length();
       int encrypted = 0;
       for (int i = 0; i < digits; i++) {
          encrypted = encrypted * 10 + maxi;
    }

    return encrypted;
    }
}