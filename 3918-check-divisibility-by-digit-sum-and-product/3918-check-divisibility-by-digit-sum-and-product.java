class Solution {
    public boolean checkDivisibility(int n) {
  
    // int digitSum = digitsum(n);
    // int digitPro = digitpro(n);
   return  n %(digitsum(n) + digitpro(n))  == 0;

    }
    public int digitsum(int n) {
        
        if(n < 10){
            return n;
        }
        return n%10 + digitsum(n / 10);
    }
    public int digitpro(int n) {
       
        if(n < 10){
            return n;
        }
        return n%10 * digitpro(n / 10);
    }
    
}