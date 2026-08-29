class Solution {
    public int maxValidSplits(int[] nums) {
        int maxi = 0;
    
        for(int r=-1;r<nums.length;r++) {
             
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++) {
                if(r == j) continue;
                list.add(nums[j]);
            }
            if(list.size() < 2) continue;
            int []p = new int[list.size()];
            int []s = new int[list.size()];
            p[0] = list.get(0);
            s[list.size() - 1] = list.get(list.size() - 1);
            for(int i=1;i<list.size();i++) {
                p[i] = gcd(p[i-1], list.get(i));
            }
            for(int i=list.size()-2;i>=0;i--) {
                s[i] = gcd(s[i+1], list.get(i));
            }
            int cnt = 0;
            for(int idx=0;idx<list.size()-1;idx++) {
                if(p[idx] == s[idx+1]){
                    cnt++;
                }
            }
            maxi = Math.max(maxi, cnt);
        }

    return maxi;
    }

    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}