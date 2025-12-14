class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String []arr = s.split(" ");
        String first = arr[0];
        sb.append(first);
        int target = countVowel(first);
        
       
        for(int i=1;i<arr.length;i++) {
            sb.append(" ");
           if(countVowel(arr[i]) == target) {
             sb.append(new StringBuilder(arr[i]).reverse());
           } else {
            sb.append(arr[i]);
        }
        }
        return sb.toString();

    }
    private static int countVowel(String s) {
        int vowel = 0;
      for(char ch : s.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        return vowel;
    }
}