package queue;

import java.util.Stack;

public class MatchingAlgorithm {
    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("())algorithm(()"));
        System.out.println(hasMatchingParentheses("())))algorithm(()))"));
        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }

    public static boolean hasMatchingParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '(' || characters[i] == ')') {
                if (characters[i] == '(') {
                    stack.push('(');
                } else if (characters[i] == ')' && stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
