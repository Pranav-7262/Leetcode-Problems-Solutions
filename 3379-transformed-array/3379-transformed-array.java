class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int newInd , newVal = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] > 0) {
                 newInd = (nums[i] + i) % n;
                 newVal = nums[newInd];
                 res[i] = newVal;
            }
            else if(nums[i] < 0) {
                 newInd = (i + nums[i] ) % n;
                if(newInd < 0) newInd += n; 
                 res[i] = nums[newInd];
            }else {
                res[i] = nums[i];
            }
        }
        return res;
    }
}