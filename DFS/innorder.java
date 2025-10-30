class innorder {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Inorder traversal (Left → Root → Right)
    static void innorder(Node root) {
        if (root == null) {
            return;
        }

       innorder(root.left);
        System.out.print(root.data + " ");
       innorder(root.right);
    }

    public static void main(String[] args) {
        // Create a tiny tree:
        //      1
        //     / \
        //    2   3

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Inorder Traversal:");
       innorder(root);
    }
}
