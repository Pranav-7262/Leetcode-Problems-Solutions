class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int n = s.length();
        for(int i=0;i<n;i++) {
            if( i > 0 && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else {
                count = 1;
            }
            if(count <= 2){
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }
}