public class ReverseOddLevelsofBinaryTree {

  public static void main(String[] args) {}

  public TreeNode reverseOddLevels(TreeNode root) {
    int lev = 0;
    TreeNode t;
    t = root.left;
    root.left = root.right;
    root.right = t;
    return root;
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
