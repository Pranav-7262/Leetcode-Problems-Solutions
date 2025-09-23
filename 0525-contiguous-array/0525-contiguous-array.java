class Solution {
    public int findMaxLength(int[] arr) {
       int n = arr.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         int sum=0;
         int max=0;
         map.put(0,-1);
        for(int i=0;i<n;i++){
           if(arr[i]==0){
               sum += -1;
           }else{
               sum += 1;
           }
          if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
        
    }  
}