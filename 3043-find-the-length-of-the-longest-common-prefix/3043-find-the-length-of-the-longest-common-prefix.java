class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int num : arr1) {
            String str = Integer.toString(num);
            StringBuilder sb = new StringBuilder();
            for(char ch :str.toCharArray()) {
                sb.append(ch);
                set.add(sb.toString());
            }
        }
        int maxi = 0;
         for(int num : arr2) {
             String str = Integer.toString(num);
             StringBuilder sb = new StringBuilder();
              for(char ch :str.toCharArray()) {
                sb.append(ch);
                if(set.contains(sb.toString())) {
                    int len = sb.length();
                    maxi = Math.max(maxi ,len);
                }
            }
         }
         return maxi;
    }
}