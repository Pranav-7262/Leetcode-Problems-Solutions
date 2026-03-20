class Solution {
    public int[] searchRange(int[] arr, int x) {
       ArrayList<Integer>list = new ArrayList<>();
         list.add(-1);
         list.add(-1);
         int n = arr.length;
         int s = 0;
         int e = n-1;
         
         while(s <= e) {
             if(arr[s] == x && arr[e] == x){
                 list.add(0,s);
                 list.add(1,e);
                 break;
             }
             if(arr[s] != x) s++;
             if(arr[e] != x) e--;
         }
         return new int[]{list.get(0),list.get(1)};
    
    }
}