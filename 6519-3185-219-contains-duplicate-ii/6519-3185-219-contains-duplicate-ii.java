class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> m = new HashMap<>();
          int n=nums.length;
          for(int i=0;i<n;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],i);
            }
            else{
                int passindex=m.get(nums[i]);
                if(Math.abs(passindex-i)<=k){

                 return true;
                }
                else{
                    m.put(nums[i],i);
                }
            }
          }
          return false;
}

}