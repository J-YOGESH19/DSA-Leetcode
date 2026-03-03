import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            // If opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {
                
                // If stack empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        
        // Stack must be empty at end
        return stack.isEmpty();
    }
}