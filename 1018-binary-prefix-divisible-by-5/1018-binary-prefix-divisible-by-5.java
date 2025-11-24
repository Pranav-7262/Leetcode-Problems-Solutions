class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int mod = 0;

        for(int num : nums) {
            mod = (mod * 2 + num ) % 5;
            if(mod == 0) {
                list.add(true);
            }else {
                 list.add(false);
            }
        }
        return list;
    }
}