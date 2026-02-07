class Solution {
    public int addMinimum(String word) {
        int ans = 0;
        String str = "abc";
       int i=0,j=0;
       while(i < word.length()){

        if(word.charAt(i) == str.charAt(j)) {
            i++;
            j = (j+1)%3;
        }
       else {
            ans++;
            j = (j+1)%3;
        }
       }
        if (j != 0) {
            ans += 3 - j;
        }
        return ans;
    }
}
