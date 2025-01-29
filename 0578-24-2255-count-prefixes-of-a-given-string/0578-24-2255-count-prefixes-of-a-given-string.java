class Solution {
    public int countPrefixes(String[] words, String s) {
         int n=words.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.startsWith(words[i])){
                cnt++;
            }
        }
        return cnt;
    }
    }
