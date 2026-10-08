class Solution {
    public String removeOuterParentheses(String s) {
        int count1 = 0;
        int count2 = 0;

        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                count1++;
            }
            else {
                count2++;
            }
            sb.append(s.charAt(i));
            if(count1 == count2) {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length()-1);
                ans.append(sb.toString());
                sb.setLength(0);
                count1 = 0;
                count2 = 0;
            }
        }
        return ans.toString();
    }
}