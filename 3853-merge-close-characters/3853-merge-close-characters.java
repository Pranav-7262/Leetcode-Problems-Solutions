class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
                int prevIdx = map.get(s.charAt(i));
                 int diff = sb.length() - prevIdx;
                if(diff <= k){
                  continue;
                }
            }
            map.put(s.charAt(i) , sb.length());
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}