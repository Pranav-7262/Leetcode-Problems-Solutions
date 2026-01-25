class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num >= 0) {
                list.add(num);
            }
        }
        int size = list.size();
        if(size == 0) return nums;
        k = k % size;
      
        int []ans = new int[n];
        int ind = 0;
        for(int i=0;i<n;i++) {
            if(nums[i]<0) {
                ans[i] = nums[i];
            }
            else{
                ans[i] = list.get((ind+k)%size);
                ind++;
            }
        }
        return ans;
    }
}