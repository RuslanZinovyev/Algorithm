package linked_list;

public class LinkedListAlgorithm {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();

        CustomLinkedList.Node node1 = new CustomLinkedList.Node(1);
        CustomLinkedList.Node node2 = new CustomLinkedList.Node(2);
        CustomLinkedList.Node node3 = new CustomLinkedList.Node(3);
        CustomLinkedList.Node node4 = new CustomLinkedList.Node(4);
        CustomLinkedList.Node node5 = new CustomLinkedList.Node(5);
        CustomLinkedList.Node node6 = new CustomLinkedList.Node(6);

        customLinkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        customLinkedList.displayObjects();
        customLinkedList.deleteKthNode(6);
        customLinkedList.displayObjects();


    }
}
