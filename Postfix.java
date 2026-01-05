import java.util.*;

public class Postfix {

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    public static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            
            else if (c == '(') {
                st.push(c);
            }
            
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }
            else if (isOperator(c)) {
                while (!st.isEmpty() && isOperator(st.peek()) &&
                       precedence(c) <= precedence(st.peek())) {
                    postfix.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String infix = sc.nextLine();
        System.out.println("Postfix expression: " + toPostfix(infix));
        sc.close();
    }
}
