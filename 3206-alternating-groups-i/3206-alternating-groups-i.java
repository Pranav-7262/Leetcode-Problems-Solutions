class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int groups = 0 , n =colors.length;
        for(int i=0;i<n;i++) {
            int a  = colors[i];
            int b = colors[(i +1) % n];
            int c = colors[(i + 2) % n];

            if(a != b && b != c) {
               groups++; 
            }
        }
        return groups;
    }
}