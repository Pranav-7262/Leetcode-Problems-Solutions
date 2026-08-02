class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int limit = a / b;
        int cnt = 0;
        for(int i=0;i<nums.length;i++) {
            int evenC = 0;
            int oddC = 0;
            for(int j=i;j<nums.length;j++) {
                if(nums[j] % 2 == 0) evenC++;
                else oddC++;
            
            if(oddC == 0) {
                continue;
            }
             if (1L * evenC * b <= 1L * oddC * a)
                    cnt++;
        }
        }
        return cnt;
    }
}