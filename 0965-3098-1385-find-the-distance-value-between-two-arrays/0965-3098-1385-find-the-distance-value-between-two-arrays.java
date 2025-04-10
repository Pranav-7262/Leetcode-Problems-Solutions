class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int n = arr1.length;
        for(int i=0;i<n;i++){
            if(isWithInDistance(arr2,arr1[i],d)){
                count++;
            }
        }
        return count;
    }
    private boolean isWithInDistance(int[]arr2,int num1,int d){
        int m = arr2.length;
        for(int i=0,j=m-1;i<=j;i++,j--){
            if(Math.abs(arr2[i]-num1)<=d ||  Math.abs(arr2[j]-num1)<=d) {
                return false;
            }
        }
        return true;
    } 
}