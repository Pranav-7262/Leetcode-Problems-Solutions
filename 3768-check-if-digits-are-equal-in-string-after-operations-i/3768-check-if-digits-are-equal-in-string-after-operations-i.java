class Solution {
    public boolean hasSameDigits(String s) {
        int sum = 0;
       while(s.length() > 2) {
         StringBuilder sb = new StringBuilder();

         for(int i=0;i<s.length()-1;i++) {
            int a = s.charAt(i)  - '0';
            int b = s.charAt(i+1) - '0';
            sum = (a+b) % 10;
            sb.append(sum);
         }
         s = sb.toString();
       }
       return s.charAt(0) == s.charAt(1);
    }
}