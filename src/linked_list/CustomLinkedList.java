package linked_list;

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
        Delete the second part of the Linked List
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

    /*
        Delete the Kth node from the end of the list
     */
    public void deleteKthNode(int k) {
        if (head == null || k == 0) return;

        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            if (second.next == null) {
                // K >= length of the list
                if (i == k - 1) {
                    head = head.next;
                }
                return;
            }
            second = second.next;
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
    }

    /*
        This method just return size of the linked list
     */
    public int size() {
        int result = 0;
        Node currentNode = head;
        while (currentNode != null) {
            result++;
            currentNode = currentNode.next;
        }
        return result;
    }

}
