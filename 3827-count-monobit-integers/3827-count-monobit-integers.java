class Solution {
    public int countMonobit(int n) {
       int count = 0;
        for(int i=0;i<=n;i++) {
            String binary = Integer.toBinaryString(i);
         
            boolean isValid = true;
            for(int j=1;j<binary.length();j++) {
                if(binary.charAt(j) != binary.charAt(j-1)) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) count+=1;
        }
        return count;
    }
}

