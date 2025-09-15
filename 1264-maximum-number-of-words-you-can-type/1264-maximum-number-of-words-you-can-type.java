class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      
         int count = 0;
         String []str = text.split(" ");
         for(String s : str){
            boolean canType = true;
            for(char ch : brokenLetters.toCharArray()) {
            if(s.contains(String.valueOf(ch))) {
                canType = false;
                break;
              }
           }
           if(canType){
            count++;
           }
         }
         return count;
    }
}