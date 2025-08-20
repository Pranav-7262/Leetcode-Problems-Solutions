class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> result = new HashSet<>();

        for(int i=0;i<list1.length;i++) {
          map.put(list1[i] , i);
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
           String word = list2[j];

           if(map.containsKey(word)) {
             int i = map.get(word);
            int sum = i+j;
             if (sum < min){
                    result.clear(); 
                    result.add(word);
                    min = sum;
           }else if (sum == min) {
                    result.add(word);
                }
           }
        }
         return result.toArray(new String[0]);
    }

}