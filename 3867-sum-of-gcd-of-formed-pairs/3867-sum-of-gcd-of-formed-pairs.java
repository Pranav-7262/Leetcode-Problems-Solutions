class Solution {
    public long gcdSum(int[] nums) {
        int [] p = new int[nums.length];
        p[0] = nums[0];
        int maxi = p[0];
        for(int i=1;i<nums.length;i++) {
            maxi = Math.max(maxi , nums[i]);
            p[i] = gcdFind(nums[i] , maxi);
        }
        Arrays.sort(p);
        long sum = 0;
        int left = 0 , right = p.length -1;
        while(left < right) {
            sum += gcdFind(p[left] , p[right]);
            left++;
            right--;
        }
        return sum;
    }
    private int gcdFind(int a , int b) {
        while(b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}