class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int p = 1;

        while(n > 0) {
            int rem = n % 10;
            if(rem!=0){
                list.add(p*rem);
            }
            p = p*10;
            n = n/10;
        }
        Collections.sort(list ,Collections.reverseOrder());
        
        int []ans = new int[list.size()];
        int i = 0;
        for(int val : list) {
            ans[i++] = val;
        }
        return ans;
    }
}