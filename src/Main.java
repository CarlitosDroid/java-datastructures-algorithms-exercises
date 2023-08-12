import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        areBracketsBalanced("{()}[]");
    }

    private static void areBracketsBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid parenthesis");
                    return;
                } else {
                    char top = stack.peek();
                    if (top == '(' && c == ')' ||
                            top == '[' && c == ']' ||
                            top == '{' && c == '}') {
                        stack.pop();
                    } else {
                        System.out.println("Invalid parenthesis");
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            System.out.println("IS VALID");
        } else {
            System.out.println("IS NOT VALID");
        }
    }
}
