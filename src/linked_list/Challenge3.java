package linked_list;

public class Challenge3 {
    /**
     * Challenge: Create an algorithm that deletes the Kth node from the end of the list.
     *
     * Examples 1:
     * Original: 5 -> 7 -> 11 -> 2 -> 18 -> null
     * K = 1
     * The first node from the end of the list is 18
     * Modified: 5 -> 7 -> 11 -> 2 -> null
     *
     * Example 2:
     * Original: 5 -> 7 -> 11 -> 2 -> null
     * K = 4
     * The fourth node from the end of the list is 5
     * Modified: 7 -> 11 -> 2 -> null
     *
     * Example 3:
     * Original: 7 -> 11 -> 2 -> null
     * K = 2
     * The second node from the end of the list is 11
     * Modified: 7 -> 2 -> null
     */

    public static void main(String[] args) {
        CustomLinkedList example1 = new CustomLinkedList();
        CustomLinkedList.Node node1 = new CustomLinkedList.Node(5);
        CustomLinkedList.Node node2 = new CustomLinkedList.Node(7);
        CustomLinkedList.Node node3 = new CustomLinkedList.Node(11);
        CustomLinkedList.Node node4 = new CustomLinkedList.Node(2);
        CustomLinkedList.Node node5 = new CustomLinkedList.Node(18);
        example1.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.print("Original list: ");
        example1.displayObjects();
        System.out.println("removed first element from the end");
        example1.deleteKthNode(1);
        System.out.print("Resulted list: ");
        example1.displayObjects();
        System.out.println();

        CustomLinkedList example2 = new CustomLinkedList();
        CustomLinkedList.Node node6 = new CustomLinkedList.Node(5);
        CustomLinkedList.Node node7 = new CustomLinkedList.Node(7);
        CustomLinkedList.Node node8 = new CustomLinkedList.Node(11);
        CustomLinkedList.Node node9 = new CustomLinkedList.Node(2);
        example2.head = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        System.out.print("Original list: ");
        example2.displayObjects();
        System.out.println("removed fourth element from the end");
        example2.deleteKthNode(4);
        System.out.print("Resulted list: ");
        example2.displayObjects();
        System.out.println();

        CustomLinkedList example3 = new CustomLinkedList();
        CustomLinkedList.Node node10 = new CustomLinkedList.Node(7);
        CustomLinkedList.Node node11 = new CustomLinkedList.Node(11);
        CustomLinkedList.Node node12 = new CustomLinkedList.Node(2);
        example3.head = node10;
        node10.next = node11;
        node11.next = node12;

        System.out.print("Original list: ");
        example3.displayObjects();
        System.out.println("removed second element from the end");
        example3.deleteKthNode(2);
        System.out.print("Resulted list: ");
        example3.displayObjects();
        System.out.println();
    }
}
