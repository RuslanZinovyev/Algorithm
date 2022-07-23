package linked_list;

import java.util.Objects;

public class CustomLinkedList {
    // inner class
    public static class Node {
        int date;
        Node next;

        public Node(int date) {
            this.date = date;
        }
    }

    Node head;

    /*
        Display nodes
     */
    public void displayObjects() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.date + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    /*
        delete the second part of the Linked List
     */
    public void deleteBackHalf() {
        if (head == null || head.next == null) {
            head = null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;
    }

}
