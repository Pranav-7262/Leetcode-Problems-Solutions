class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int countone = 0;
        int countzero = 0;
        int  max0 = 0, max1 = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
               max0 = Math.max(max0,++countzero);
               countone=0;
            }else{
                max1 = Math.max(max1,++countone);
               countzero=0;
            }
        }
        return max1 > max0;
    }
}