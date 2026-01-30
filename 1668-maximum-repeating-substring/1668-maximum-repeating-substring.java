class Solution {
    public int maxRepeating(String sequence, String word) {
          
          String repeated = word;
          int count = 0;
           while(sequence.contains(repeated)) {
            count++;
            repeated += word;
           }
          return count;
    }
}