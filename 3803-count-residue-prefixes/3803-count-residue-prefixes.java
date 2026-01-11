class Solution {
    public int residuePrefixes(String s) {
        int count = 0;
         for(int i=1;i<=s.length();i++) {
             if(isValid(s.substring(0,i))) {
                 count++;
             }
         }
        return count;
    }
    private static boolean isValid(String s) {
        int len = s.length();
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) {
            set.add(ch);
        }
        return set.size() == len % 3;
    }
}