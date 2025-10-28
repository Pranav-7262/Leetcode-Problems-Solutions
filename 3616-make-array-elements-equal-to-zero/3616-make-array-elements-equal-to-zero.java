class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                if(simulate(nums , i , -1)) total++;
                if(simulate(nums , i , 1)) total++;
            }
        }
        return total;
    }
    private boolean simulate(int []nums ,int start , int dir) {
        int n = nums.length;
        int [] arr = nums.clone();
        int curr = start;
        while(curr >= 0 && curr < n) {
            if(arr[curr] == 0) {
                curr += dir;
            }else{
                arr[curr]--;
                dir = -dir;
                curr += dir;
            }
        }
        for (int x : arr) {
            if (x != 0) return false;
        }
        return true;
    }
}