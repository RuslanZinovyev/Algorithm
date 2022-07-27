package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr, 17));
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 1));
    }

    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid + 1;
            }
        }
        return false;
    }
}
