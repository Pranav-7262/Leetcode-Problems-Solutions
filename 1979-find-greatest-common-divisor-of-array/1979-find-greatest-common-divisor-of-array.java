class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcdTwo(min, max);
    }
    public int gcdTwo(int a,int b)  {
          if(b==0) return a;
          return gcdTwo(b,a%b);
    }
}