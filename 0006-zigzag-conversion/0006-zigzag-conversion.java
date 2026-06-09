class Solution {
    public String convert(String str, int m) {
         if(m == 1 || str.length() <= m) {
            return str;
        }
        StringBuilder []sb = new StringBuilder[m];
        for(int i=0;i<m;i++) {
            sb[i] = new StringBuilder();
        }
        int curr = 0;
        boolean down = false;
        for(char ch: str.toCharArray()) {
            sb[curr].append(ch);
            if(curr == 0) {
                down = true;
            }
            else if(curr == m-1) {
                down = false;
            }
            curr += down ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder strs : sb) {
            res.append(strs);
        }
        return res.toString();
    }
}