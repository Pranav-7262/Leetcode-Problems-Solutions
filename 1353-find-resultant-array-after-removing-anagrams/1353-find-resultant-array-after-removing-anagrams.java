class Solution {
    public List<String> removeAnagrams(String[] words) {
         List<String> ans = new ArrayList<>();
        int n = words.length;
        for(String word : words) {
           if(!ans.isEmpty() && areAnagrams(ans.get(ans.size()-1) , word)) {
             continue;
           }
           else{
            ans.add(word);
           }
           
        }
         return ans;
       
    }
    private boolean areAnagrams(String s1 , String s2) {
         if (s1.length() != s2.length()) return false;

        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}