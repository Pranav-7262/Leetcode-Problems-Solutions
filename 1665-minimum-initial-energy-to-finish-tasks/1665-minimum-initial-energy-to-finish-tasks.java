class Solution {
    public int minimumEffort(int[][] tasks) {
            Arrays.sort(tasks, (a, b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });
        int currenergy = 0;
        int initial = 0;
        for (int[] t : tasks) {
            int actual = t[0];
            int minimum = t[1];
            if(currenergy < minimum) {
                initial += (minimum - currenergy);
                currenergy = minimum;
            }
            currenergy -= actual;
        }
        return initial;
    }
}