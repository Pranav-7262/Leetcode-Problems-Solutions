class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int []res = new int[nums.length];
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
           if(i%2==0){
            even.add(nums[i]);
           } else{
             odd.add(nums[i]);
           }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int k=0;
        int j=odd.size()-1;
         for(int i=0;i<nums.length;i+=2){
        res[i] = even.get(k++);
       }
        for(int i=1;i<nums.length;i+=2){
        res[i] = odd.get(j--);
       }
        return res;
    }
}