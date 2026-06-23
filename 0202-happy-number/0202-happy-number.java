class Solution {
    public boolean isHappy(int n) {
        int slow=findSquare(n);
        int fast=findSquare(findSquare(n));
        
            while(slow!=fast) {
                slow=findSquare(slow);
                fast=findSquare(findSquare(fast));
            }
          
        if(slow==1){
            return true;
        }
        return false;

    }
    
        private int findSquare(int number) {
            int ans=0;
            while(number>0){
                int rem=number%10;
                ans = ans+rem*rem;
                number = number/10;
            }
            return ans;
        }
}