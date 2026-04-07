class NumArray {
  int [] pre; 
    public NumArray(int[] nums) {
        pre = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            pre[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) {
            return pre[right];
        }
       return pre[right] - pre[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */