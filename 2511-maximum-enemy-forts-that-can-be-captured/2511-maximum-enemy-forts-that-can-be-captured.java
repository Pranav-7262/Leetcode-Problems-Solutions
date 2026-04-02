class Solution {
    public int captureForts(int[] forts) {
        int maxZ = 0;
        for(int i=0;i<forts.length;i++) {
           if(forts[i] != 0) {
            int c = 0;
           
            for(int j=i+1;j<forts.length;j++) {
                if(forts[j] == 0) {
                    c++;
                }
                else {
                    if(forts[i] != forts[j]) maxZ = Math.max(c ,maxZ);
                    break;
                }
            }
           }
        }
        return maxZ;
    }
}