package tree;

public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        insert(this.root, value);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            // insert on right
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " -> ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

}
