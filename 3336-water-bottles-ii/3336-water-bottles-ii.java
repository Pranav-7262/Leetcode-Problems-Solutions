class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drinkW = 0;
        int emptyB = 0;
        int exchange = numExchange;
        int currentFullBottles  = numBottles;

        while(currentFullBottles > 0) {
            
            drinkW += currentFullBottles;

            emptyB += currentFullBottles;
            currentFullBottles = 0;

           while(emptyB >= exchange) {
            emptyB -= exchange;
            currentFullBottles += 1;
            exchange += 1;
           }
          
          
        }
        return drinkW;

    }
}