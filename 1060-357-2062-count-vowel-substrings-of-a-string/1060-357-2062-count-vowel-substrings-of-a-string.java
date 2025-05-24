class Solution {
    public int countVowelSubstrings(String word) {
        int c = 0;
        HashSet<Character> set = new HashSet<>();
        int n = word.length();
        for(int i=0;i<n-4;i++) {
            set.clear();
            for(int j=i;j<n;j++){
                  char ch = word.charAt(j);
                  if("aeiou".contains(String.valueOf(ch))) {
                    set.add(ch);
                    if(set.size() == 5){
                        c++;
                    }
                  }
                else {
                    break;
                }
            }
   
        }
              return c;
    }
   
}