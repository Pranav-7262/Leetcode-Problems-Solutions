class Solution {
    public int numberOfSubstrings(String s) {
        int []cnt = {0,0,0};
        int left=0,res=0;
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;

            while(cnt[0]>0 && cnt[1]>0 && cnt[2]>0){
                res += s.length() - i;
                 cnt[s.charAt(left)-'a']--;
                    left++;
            }
        }
        return res;
    }
}