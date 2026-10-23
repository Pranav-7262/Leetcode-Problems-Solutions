class Solution {
    public int minOperations(String s) {
        

        char maxChar = 'a';
        char minChar = 'z';
        int n = s.length();
      
        int maxIdx = -1, minIdx = -1;
        boolean flag = true;
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(i > 0 ){
            if(s.charAt(i- 1) > ch) {
                flag = false;
             }
            }
            if(ch < minChar) {
                minChar = ch;
                minIdx = i;
            }
            if(ch >= maxChar) {
                maxChar = ch;
                maxIdx = i;
            }

        }
        if(flag) {
            return 0;
        }
          if(n <= 2) return -1; 
        if(minIdx == n-1 && maxIdx == 0) {
            return 3;
        }
        if(minIdx == 0 || maxIdx == n - 1) {
            return 1;
        }
        

        return 2;
    }
}

