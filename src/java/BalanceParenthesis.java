import java.util.Stack;

public class BalanceParenthesis {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (!matches(open, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String[] testExpressions = {
            "()",
            "()[]{}",
            "(]",
            "([])",
            "((a + b) * (c - d))"
        };
        for (String expr : testExpressions) {
            System.out.println("Is balanced: " + isBalanced(expr) + " for '" + expr + "'");
        }
    }

}

class BalanceParenthesis_improved {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c: s.toCharArray()){
            // We are pushing the opposite of a bracket.
            // This is because when the actual closing bracket arrives, we can easily match
            // on the basis of whether the popped and arrived element are the same
            if(c == '{'){
                stk.push('}');
            }
            else if(c == '('){
                stk.push(')');
            }
            else if(c == '['){
                stk.push(']');
            }
            else if(stk.isEmpty() || stk.pop() != c){
                // Means we are not receiving the correct closure.
                return false;
            }
        }
        // Loop has ended. Ideally all characters should have been popped.
        return stk.isEmpty();
    }
}


