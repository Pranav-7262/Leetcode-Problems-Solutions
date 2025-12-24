class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int mini = Integer.MAX_VALUE;
        int target = 0 , sum = 0;
        for(int num : apple) target += num;

        int count = 0;
        for(int i=capacity.length-1;i>=0;i--) {
            sum += capacity[i];
            count++;
            if(sum >= target) break;
        }
        return count;
    }
}