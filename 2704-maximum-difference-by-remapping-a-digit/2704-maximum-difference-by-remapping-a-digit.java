class Solution {
    public int minMaxDifference(int num) {
        String str =String.valueOf(num);
        int i=0;
        while(i < str.length() && str.charAt(i) == '9'){
            i++;
        }
        int max;
        if(i==str.length()){
           max=num; 
        } else{
            max=Integer.parseInt(str.replace(str.charAt(i),'9'));
        }
        String m=String.valueOf(num);
        int min=Integer.parseInt(m.replace(m.charAt(0),'0'));
        
        return max-min;
    }
}