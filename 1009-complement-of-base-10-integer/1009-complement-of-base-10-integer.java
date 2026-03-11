class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder res = new StringBuilder();
        String str = Integer.toBinaryString(n);
        for(char ch : str.toCharArray()) {
            if(ch == '1') res.append('0');
            else res.append('1');
        }
        return (int)Integer.parseInt(res.toString(), 2);
    }
}