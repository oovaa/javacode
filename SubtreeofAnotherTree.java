public class SubtreeofAnotherTree {

    public static void main(String[] args) {
        // Test Case 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(2);

        TreeNode subRoot1 = new TreeNode(4);
        subRoot1.left = new TreeNode(1);
        subRoot1.right = new TreeNode(2);

        boolean result1 = isSubtree(root1, subRoot1);
        System.out.println("Test Case 1: " + result1); // Expected output: true

        // Test Case 2
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(2);
        root2.right.right = new TreeNode(0);

        TreeNode subRoot2 = new TreeNode(4);
        subRoot2.left = new TreeNode(1);
        subRoot2.right = new TreeNode(2);

        boolean result2 = isSubtree(root2, subRoot2);
        System.out.println("Test Case 2: " + result2); // Expected output: false
    }

  static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) return false;

    if (isSameTree(root, subRoot)) return true;

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;

    if (p == null || q == null) return false;

    return (
      p.val == q.val &&
      isSameTree(p.left, q.left) &&
      isSameTree(p.right, q.right)
    );
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
