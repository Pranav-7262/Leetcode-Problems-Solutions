class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
         StringBuilder sb = new StringBuilder();
        
         for(String str : words) {
             int sum = 0;
            for(char ch : str.toCharArray()) {
                sum +=  weights[ch - 'a'];
            }
            int mod = sum % 26;
            char mapped = (char) ('z' - mod);
            sb.append(mapped);
         }
         return sb.toString();
    }
}