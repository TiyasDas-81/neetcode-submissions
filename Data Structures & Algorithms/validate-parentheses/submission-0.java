class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();

        for(int i=0; i < n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char prev = stack.pop();
                    if((prev == '(' && c == ')') || (prev == '{' && c == '}') || (prev == '[' && c == ']')) continue;
                    else{
                        return false;
                    }
                }
            }
        }

        return (!stack.isEmpty()) ? false : true;
    }
}
