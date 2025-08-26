class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> ans = new ArrayList<>();
         for(int i=left;i<=right;i++) {
            if(check(i)){
                ans.add(i);
            }
         }
         return ans;
    }
    private boolean check(int num){
        int ori = num;
        while(num!=0){
            int rem = num%10;
             if (rem == 0 || ori % rem != 0) {
                return false;
            }
            num = num/10;
        }
        return true;
    }
}