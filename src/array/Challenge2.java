package array;

import java.util.Arrays;

public class Challenge2 {
    /*
        Challenge: Create an algorithm that rotates the contents of an array to the left by one space
        This rotation should be done in place. A new array should not be created.
        Input: {1, 2, 3, 4, 5, 6}
        Output: {2, 3, 4, 5, 6, 1}
     */

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(input1));
        int[] output1 = rotateArrayLeft(input1);
        System.out.println(Arrays.toString(output1));
        System.out.println("==================");
        System.out.println(Arrays.toString(output1));
        int[] output2 = rotateArrayRight(output1);
        System.out.println(Arrays.toString(output2));

    }

    public static int[] rotateArrayLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        return arr;
    }

    public static int[] rotateArrayRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        return arr;
    }
}
