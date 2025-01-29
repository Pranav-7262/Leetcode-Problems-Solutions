class Solution {
    public int[] sortedSquares(int[] nums) {
       
        // for(int i=0;i<n;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int left=0;
        int right=nums.length-1;
        int []newarray=new int[nums.length];
         int n=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])> Math.abs(nums[right])){
                 newarray[n]=nums[left]*nums[left];
                 left++;
            }
            else{
                newarray[n]=nums[right]*nums[right];
                right--;
            }
            n--;
        }
        return newarray;
    }
}