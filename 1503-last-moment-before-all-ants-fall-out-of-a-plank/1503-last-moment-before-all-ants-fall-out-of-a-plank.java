class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
         int maxi = 0;
       
    for(int num : left) {
        maxi = Math.max(maxi , num);
    }
    for(int num : right) {
        maxi = Math.max(maxi , n - num);
    }   
    return maxi;
    }
}