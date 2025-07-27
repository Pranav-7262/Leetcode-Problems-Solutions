class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;

      ArrayList<Integer> list = new ArrayList<>();
      list.add(nums[0]);
      for(int i=1;i<n;i++){
        if(nums[i] != nums[i-1]){
            list.add(nums[i]);
        }
      }
      int count = 0;
      for(int i=1;i<list.size()-1;i++){
        int s = list.get(i-1);
        int m = list.get(i);
        int e = list.get(i+1);
        if(m > s && m > e){
            count++;
        }else if(m < s && m < e){
            count++;
        }
      }
      return count;
    }

}