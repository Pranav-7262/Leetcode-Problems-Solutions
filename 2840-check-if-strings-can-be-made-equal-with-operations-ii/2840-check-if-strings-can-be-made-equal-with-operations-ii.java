class Solution {
    public boolean checkStrings(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
            } else {
                sb3.append(s1.charAt(i));
                sb4.append(s2.charAt(i));
            }

        }
        char[] e1 = sb1.toString().toCharArray();
        char[] e2 = sb2.toString().toCharArray();
        char[] o1 = sb3.toString().toCharArray();
        char[] o2 = sb4.toString().toCharArray();

        Arrays.sort(e1);
        Arrays.sort(e2);
        Arrays.sort(o1);
        Arrays.sort(o2);

        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }
}