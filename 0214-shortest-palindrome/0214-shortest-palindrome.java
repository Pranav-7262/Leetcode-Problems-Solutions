class Solution {
    public String shortestPalindrome(String str) {
        int n = str.length();
		String rev = new StringBuilder(str).reverse().toString();

		for(int i=0;i<n;i++) {
			if(str.startsWith(rev.substring(i))) {
				return rev.substring(0,i)+str;
			}
		}
		return "";
    }
}