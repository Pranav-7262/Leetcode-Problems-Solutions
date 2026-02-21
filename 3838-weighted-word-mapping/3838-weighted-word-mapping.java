class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder  sb = new StringBuilder ();
        
        for(String str : words) {
            int sum = 0;
            for(int i=0;i<str.length();i++) {
                sum += weights[str.charAt(i) - 'a'];
            }
            int mod = sum % 26;
            char map =  (char)('z' - mod);
            sb.append(map);
        }
        return sb.toString();
    }
}