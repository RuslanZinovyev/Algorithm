package queue;

import java.util.Stack;

public class StackAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 9, 3, 6};
        printNextGreaterElement(arr);
    }

    public static void printNextGreaterElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);// put 2 on the top of the stack

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i]; // next = 1
            if (!stack.isEmpty()) {
                int popped = stack.pop(); //get 4 from the top and remove it from stack (stack is empty now)
                while (popped < next) { // 4 < 1 => false
                    System.out.println(popped + " --> " + next); // 2 --> 4
                    if (stack.isEmpty()) break;
                    popped = stack.pop();
                }
                if (popped > next) { // 4 > 1
                    stack.push(popped); // 4, 1
                }
            }
            stack.push(next); // 4 in stack
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
    }

}
