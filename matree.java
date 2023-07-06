import java.util.NoSuchElementException;

public class matree {

  public static void main(String[] args) {
    matree t = new matree();
    t.add(5);
    t.add(0);
    t.add(3);
    t.add(2);
    t.add(10);
    t.add(14);
    t.add(4);
    t.add(1);
    t.add(6);
    t.add(7);
    t.delet(5); //TODO fix root deletion
    // System.out.println(t.find(2).right);
    // System.out.println(t.find(2).left);
    // System.out.println(t.root);
    // System.out.println(t.contains(12));
    // t.inorder();
    // System.out.println(t.min());
    // System.out.println(t.max());
  }

  Node root, cur, pre = null;
  int count = 0;

  class Node {

    int val;
    Node left, right;

    Node() {}

    Node(int val) {
      this.val = val;
    }

    @Override
    public String toString() {
      return this.val + "";
    }
  }

  matree() {}

  boolean add(int val) {
    if (contains(val)) {
      System.out.println("allready there");
      return false;
    }

    root = adder(root, val);
    count++;
    return true;
  }

  int size() {
    return count;
  }

  int max() {
    Node cur = root;
    while (cur.right != null) {
      cur = cur.right;
    }
    return cur.val;
  }

  int min() {
    Node cur = root;
    while (cur.left != null) {
      cur = cur.left;
    }
    return cur.val;
  }

  private Node adder(Node x, int val) {
    if (x == null) {
      x = new Node(val);
      return x;
    }

    if (x.val > val) x.left = adder(x.left, val);

    if (x.val < val) x.right = adder(x.right, val);

    return x;
  }

  Node delet(int val) {
    Node cur = root;
    Node pre = root;
    while (cur != null) {
      // System.out.println(pre);
      // System.out.println(pre);
      if (cur.val > val) {
        pre = cur;
        cur = cur.left;
      } else if (cur.val < val) {
        pre = cur;
        cur = cur.right;
      } else break;
    }

    if (cur == null) throw new NoSuchElementException("node not found");

    if (cur.left == null && cur.right != null) {
      return delw1n(cur, pre);
    } else if (cur.left != null && cur.right == null) {
      return delw1n(cur, pre);
    } else if (cur.left == null && cur.right == null) return delleaf(
      cur,
      pre
    ); else if (cur.left != null && cur.right != null) {
      Node suc = getSuc(cur);
      cur = suc;
      suc.left = cur.left;
      suc.right = cur.right;
      System.out.println("suc " + suc.left);
      cur.left = null;
      cur.right = null;
      // System.out.println(cur);
      if (this.root == cur) this.root = suc;
      System.out.println("root " + root);

      // rnws(cur,pre,suc); //replace node with suc;
      return cur;
    }
    return null;
  }

  private matree.Node getSuc(Node cur) {
    cur = cur.left;
    while (cur.right != null) {
      cur = cur.right;
    }
    // System.out.println(cur);
    return cur;
  }

  private boolean contains(int val) {
    return find(val) != null;
  }

  private Node find(int val) {
    Node cur = root;
    while (cur != null) {
      if (cur.val > val) cur = cur.left; else if (cur.val < val) cur =
        cur.right; else return cur;
    }
    return null;
  }

  Node delleaf(matree.Node cur, matree.Node pre) {
    // System.out.println(pre);
    if (pre.left == cur) pre.left = null; else if (pre.right == cur) pre.right =
      null;

    return cur;
  }

  Node delw1n(matree.Node cur, matree.Node pre) { // delet with one node
    if (pre.left == cur) {
      if (cur.left != null) {
        pre.left = cur.left;
        cur.left = null;
      }
      if (cur.right != null) {
        pre.left = cur.right;
        cur.right = null;
      }

      return cur;
    } else if (pre.right == cur) {
      if (cur.left != null) {
        pre.right = cur.left;
        cur.left = null;
      }
      if (cur.right != null) {
        pre.right = cur.right;
        cur.right = null;
      }
      return cur;
    }
    return null;
  }

  void print(Node root) {
    Node cur = root;
    print(cur.left);
    System.out.println(cur.val);
    print(cur.right);
  }

  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);

      System.out.print(root.val + " ");

      inorderRec(root.right);
    }
  }

  void preorderRec(Node root) {
    if (root != null) {
      System.out.print(root.val + " ");
      preorderRec(root.left);
      preorderRec(root.right);
    }
  }

  void postorderRec(Node root) {
    if (root != null) {
      postorderRec(root.left);
      postorderRec(root.right);
      System.out.print(root.val + " ");
    }
  }

  void inorder() {
    inorderRec(root);
  }

  void preorder() {
    preorderRec(root);
  }

  void postorder() {
    postorderRec(root);
  }
}
