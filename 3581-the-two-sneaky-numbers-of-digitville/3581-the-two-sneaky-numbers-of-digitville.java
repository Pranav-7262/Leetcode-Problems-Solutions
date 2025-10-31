class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         int [] arr = new int[2];
        int i=0;
       for(int num:map.keySet()){
        if(map.get(num)==2){
            arr[i++] = num;
        }
      
       }
       return arr;
    }
}