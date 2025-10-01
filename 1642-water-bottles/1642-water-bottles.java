class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       
        int total = 0;
        int empty = 0;
       
    while(numBottles > 0 ){
         total += numBottles;
         empty += numBottles;

         numBottles = 0;

        int newB = empty / numExchange;
        
        empty = empty % numExchange;
        numBottles += newB;
    }
        return total;
    }
}