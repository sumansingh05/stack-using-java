import java.util.Stack;

public class BracketValidator {
    public static boolean isValid(String input) {
        if (input == null || input.isEmpty()) {
            return true; // Empty string is considered balanced
        }

        Stack<Character> stack = new Stack<>();
        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no corresponding opening bracket
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                    (bracket == ']' && top != '[') ||
                    (bracket == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            } else {
                // Ignore non-bracket characters
            }
        }

        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        String input3 = "()";
        
        System.out.println("Is input1 balanced? " + isValid(input1)); // true
        System.out.println("Is input2 balanced? " + isValid(input2)); // false
        System.out.println("Is input3 balanced? " + isValid(input3)); // true
    }
}
