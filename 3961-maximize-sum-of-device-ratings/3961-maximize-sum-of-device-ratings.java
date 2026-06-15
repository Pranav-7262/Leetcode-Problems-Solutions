class Solution {
    public long maxRatings(int[][] units) {
        long sumSecond = 0;
        long mini = Integer.MAX_VALUE;
        long min = Integer.MAX_VALUE;
        for(int []arr : units) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int x : arr){
                if(x<min1){
                    min2 = min1;
                    min1 = x;
                }else if(x<min2){
                    min2 = x;
                }
            }
            mini = Math.min(mini , min1);
            int second = (arr.length == 1) ? min1 : min2;
            sumSecond += second;
            min = Math.min(min , second);
        }
        return mini + sumSecond - min;
    }
}