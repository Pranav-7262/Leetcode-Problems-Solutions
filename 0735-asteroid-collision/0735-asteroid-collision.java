class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int num : asteroids) {
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peek() > 0 && num < 0) {
                if(stack.peek() < -num){
                    stack.pop();
                }else if(stack.peek() == -num){
                    stack.pop();
                    destroyed = true;
                    break;
                }else {
                     destroyed = true;
                     break;
                }
            }
            if(!destroyed) {
                stack.push(num);
            }
        }
        int []arr = new int[stack.size()];
        for(int i=stack.size()-1;i >= 0; i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}