class Solution {
    public String removeDuplicates(String s) {
        StringBuilder Stack = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Stack.length()>0 && Stack.charAt(Stack.length()-1)==c){
                Stack.deleteCharAt(Stack.length()-1);
            }
            else {
                Stack.append(c);
            }
        }
        return Stack.toString();
    }
}