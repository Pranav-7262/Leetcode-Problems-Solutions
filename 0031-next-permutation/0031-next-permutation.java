class Solution {
    public void nextPermutation(int[] nums) {
        int bp = -1;
        
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < nums[i+1]){
            bp = i;
            break;
            }
        }
        if(bp == -1) {
            reverse(0, nums.length-1,nums);
            return;
        }
        int smidx = nums.length-1;
        for (int i = nums.length - 1; i > bp; i--) {
            if (nums[i] > nums[bp]) {
                smidx = i;
                break;
            }
        }
        int temp = nums[bp];
        nums[bp] = nums[smidx];
        nums[smidx] = temp;

       reverse(bp+1, nums.length-1, nums);

    }
    private void reverse(int start, int end ,int []numbers) {

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            start++;
            end--;
        }
    }

} 