import java.util.Scanner;
import java.util.Stack;

public class Wellness_Check {

    static boolean check(String pattern) {
        Stack<Character> stack = new Stack<>();
        for (char c : pattern.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern;
        System.out.println("Enter pattern to check:");
        pattern = sc.next();
        System.out.println("\nPattern is balanced: " + check(pattern));
    }
}
