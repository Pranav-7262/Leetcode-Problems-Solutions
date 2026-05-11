class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            List<Integer> listD = new ArrayList<>();
            while (num > 0) {
                int rem = num % 10;
                listD.add(rem);
                num /= 10;
            }
            Collections.reverse(listD);
            for (int p : listD) {
                list.add(p);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}