class Solution {
  public int[] singleNumber(int[] nums) {
         HashMap<Integer,Integer> hm = new HashMap<>();
        for (int num:nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        int []res = new int[2];
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                res[cnt++] = entry.getKey();
                if(cnt==2){
                break;
                }
            }
        }
        return res;

    }
}