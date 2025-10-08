class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> list = new ArrayList<>();
          int k = p.length();
        int count=0;
        
        Map<Character,Integer> patmap = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
         
        for(char ch : p.toCharArray()) {
            patmap.put(ch,patmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
             window.put(ch,window.getOrDefault(ch,0)+1);
             
             if (i >= k) {
                char leftChar = s.charAt(i - k);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
            }
            
           
            if(i >= k-1 && window.equals(patmap)) {
                list.add(i - k + 1);
            }
        }
        return list;
    
    }
}