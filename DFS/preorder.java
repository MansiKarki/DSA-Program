class preorder {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Preorder traversal (Root → Left → Right)
    static void preorder(Node root) {
        // Step 1: stop if no node is present
        if (root == null) {
            return;
        }

        // Step 2: print the current node's value
        System.out.print(root.data + " ");

        // Step 3: go to the left child
        preorder(root.left);

        // Step 4: go to the right child
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Create a tiny tree:
        //      1
        //     / \
        //    2   3

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}
