package tree;

public class Main {
    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.data = 2;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
        tree.insert(54);
        tree.insert(34);
        tree.insert(65);
        tree.insert(14);

        System.out.println(tree.isElementExist(35));
    }
}
