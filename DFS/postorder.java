class postorder {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Postorder traversal (Left → Right → Root)
    static void postorder(Node root) {

        // Step 1: stop if no node is present
        if (root == null) {
            System.out.println("Empty");;
        }

        // Step 2: go to the left child
        postorder(root.left);

        // Step 3: go to the right child
        postorder(root.right);

        // Step 4: print the current node’s value
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        // Create a tiny tree:
        //      1
        //     / \
        //    2   3

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
