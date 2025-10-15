class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++) {
            maxi = Math.max(maxi , candies[i]);
        }
        for(int i=0;i<candies.length;i++) {
            if(candies[i] + extraCandies >= maxi) {
                res.add(true);
            } else {
                 res.add(false);
            }
        }
        return res;
    }
}