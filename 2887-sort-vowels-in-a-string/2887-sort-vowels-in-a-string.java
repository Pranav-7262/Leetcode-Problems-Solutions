class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        
        Set<Character> set = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'
        ));
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                list.add(c);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int index = 0;
         for(char c : s.toCharArray()){
           if(set.contains(c)){
            sb.append(list.get(index++));
           } else{
            sb.append(c);
           }
        }
        return sb.toString();
    }
 
}