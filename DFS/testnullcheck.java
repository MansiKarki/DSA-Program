class testnullcheck {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static void check(Node root) {
        // This part runs only if root is null
        if (root == null) {
            System.out.println("Tree is empty (root is null)");
            return;
        }

        // This part runs only if root is not null
        System.out.println("Tree is not empty. Root value: " + root.data);
    }

    public static void main(String[] args) {
        Node root1 = null;          // empty tree
        Node root2 = new Node(10);  // non-empty tree

        System.out.println("Case 1:");
        check(root1);   // should print "Tree is empty"

        System.out.println("\nCase 2:");
        check(root2);   // should print "Tree is not empty. Root value: 10"
    }
}

