class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                cnt++;
            }
            if(cnt%2==0){
                ans++;
                
            }
        }
        return ans;

    }
}