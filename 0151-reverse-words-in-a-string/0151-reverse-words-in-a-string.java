class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = words.length-1;
        while(i < j) {
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }
        for(int idx=0;idx<words.length;idx++){
            if(idx == words.length-1){
                 sb.append(words[idx]);
                 break;
            }
            sb.append(words[idx] + " ");
        }
        return sb.toString();

    }
}