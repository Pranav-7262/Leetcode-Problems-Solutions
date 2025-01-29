class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int start=0;
        int end=nums.length-1;
        int result[]= new int[2];
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }

        
            if(nums[start]!=target){
                 return new int[]{-1,-1};
        
        }
            result[0]=start;
            end=nums.length;
             while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
         result[1]=start-1;
         return result;


    
    }
}