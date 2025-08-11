public class Inorderr {

    // Define your own TreeNode class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder traversal method (prints node values)
    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    // Main method to create a tree and call traversal
    public static void main(String[] args) {
        // Construct tree: [1, null, 2, 3]
        //       1
        //        \
        //         2
        //        /
        //       3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Inorderr solution = new Inorderr();
        System.out.print("Inorder Traversal: ");
        solution.inorderTraversal(root);  // Output: 1 3 2
    }
}
