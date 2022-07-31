package queue;

import java.util.Stack;

public class StackAlgorithm {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 5, 9, 3, 6};
        printNextGreaterElement(arr1);
        int[] arr2 = {16, 7, 2, 15};
        printNextGreaterElement(arr2);
    }

    public static void printNextGreaterElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if (stack.peek() >= next) {
                stack.push(next);
            } else {
                while (!stack.isEmpty() && stack.peek() < next) {
                    System.out.println(stack.peek() + " --> " + next);
                    stack.pop();
                }
                stack.push(next);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
        System.out.println();
    }

}
