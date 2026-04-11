class Solution {
    public int minimumDistance(int[] nums) {
        int minimum = Integer.MAX_VALUE , good = -1;
        
        int n = nums.length;
        if(n < 3) return good;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
             for(int k=j+1;k<n;k++) {
             if(nums[i] == nums[j] && nums[i] == nums[k]) {
                 good = Math.abs(i - j) + Math.abs(k - j) + Math.abs(i - k);
                 minimum = Math.min(minimum , good);
             }
         }
    }
 }
        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }
}