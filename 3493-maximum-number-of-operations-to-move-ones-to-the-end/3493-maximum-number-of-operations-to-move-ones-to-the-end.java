class Solution {
    public int maxOperations(String s) {
        int n = s.length() , count = 0 , ones = 0 ,i=0;
        
        while(i < n){
            if(s.charAt(i) == '1') {
                    ones++;
                    i++;
            }else {
                while(i < n && s.charAt(i) == '0'){
                    i++;
                }
                count += ones;
            }
        }
        return count;
    }
}