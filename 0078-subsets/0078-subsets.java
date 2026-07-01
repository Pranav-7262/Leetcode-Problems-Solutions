class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generate(0, arr, new ArrayList<>(), result);
        return result;
    }
    static void generate(int idx,int []nums,List<Integer>list , List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
           list.add(nums[idx]);
        generate(idx+1,nums,list,result);
       list.remove(list.size()-1);

       
        generate(idx+1,nums,list,result);
        
    }
}