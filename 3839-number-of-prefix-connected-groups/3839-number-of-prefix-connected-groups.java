class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String ,Integer> map = new HashMap<>();

        for(String word : words) {
            if(word.length() < k) continue;
            String sub = word.substring(0 , k);
            map.put(sub , map.getOrDefault(sub,0)+1);
        }
        int ans = 0;
        for(String  key : map.keySet()) {
            if(map.get(key) >= 2) {
                ans++;
            }
        }
        return ans;
    }
}