class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
         int []ans = new int[nums.size()];

        for(int i=0;i<nums.size();i++) {
            int x = nums.get(i);
            if((x&1)==0) {
                ans[i]=-1;
                continue;
            }
            int t=0;
            int temp=x;
            while((temp & 1) == 1) {
                t++;
                temp = temp >> 1;
            }

           ans[i] = x- (1 << (t - 1));
        }
        return ans;
    }
}