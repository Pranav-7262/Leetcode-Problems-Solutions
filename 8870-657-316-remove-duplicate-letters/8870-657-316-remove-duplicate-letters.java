class Solution {
    public String removeDuplicateLetters(String s) {
       Map<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.get(ch)-1);
            if (visited.contains(ch)) continue;
            while (!stack.isEmpty() && stack.peek()>ch && map.get(stack.peek())>0){
                visited.remove(stack.pop());
            }
            stack.push(ch);
            visited.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
   }
}