package hash;

import linked_list.CustomLinkedList;

public class Challenge4 {

    public static void main(String[] args) {

        CustomLinkedList noCycleLinkedList = new CustomLinkedList();

        CustomLinkedList.Node firstNode = new CustomLinkedList.Node(3);
        CustomLinkedList.Node secondNode = new CustomLinkedList.Node(4);
        CustomLinkedList.Node thirdNode = new CustomLinkedList.Node(5);
        CustomLinkedList.Node fourthNode = new CustomLinkedList.Node(6);
        // 3 -> 4 -> 5 -> 6 -> null
        noCycleLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        // 3 -> 4 -> 5 -> 4 -> 5 -> 4 -> 5 -> 4...
        System.out.println(noCycleLinkedList.hasCycle());

        CustomLinkedList cycleLinkedList = new CustomLinkedList();
        cycleLinkedList.head = firstNode;
        thirdNode.next = secondNode;

        System.out.println(cycleLinkedList.hasCycle());
    }
}
