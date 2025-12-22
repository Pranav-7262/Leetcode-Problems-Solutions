class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
     
         int maxi = 0  ,idx = 0;

        for(int i=0;i<mat.length;i++) {
            int oneCount = 0;
            for(int num : mat[i]) {
                if(num == 1) {
                    oneCount++;
                }
            }
            if(maxi < oneCount) {
                maxi = oneCount;
                idx = i;
            }
        }
        return new int[]{idx , maxi};
}
}