class Solution {
    public int minPartitions(String n) {
       
        int maxi = -1;
      for(int i=0;i<n.length();i++) {
         int num = n.charAt(i) - '0';
        maxi = Math.max(maxi , num);
      }
        return maxi;
    }
}