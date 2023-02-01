class linky {

  public static void main(String[] args) {
    malink test = new malink();
    test.add(4);
    test.add(1);
    test.add(7);
    test.add(5);
    test.delet(1);
    test.addFirst(20);
    test.add(0, 15);
    System.out.println(test.search(73));
   // System.out.println(test.isEmpty());
    System.out.println(test);
  }
}

class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  @Override
  public String toString() {
    return String.valueOf(data);
  }
}

class malink {

  int data;
  Node first = null;
  Node next;
  private static int size = 0;

  malink() {}

  int size() {
    return size;
  }

  boolean isEmpty() {
    return first == null;
  }

  @Override
  public String toString() {
    String s = "[";
    Node curr = first;

    while (curr != null) {
      s += String.valueOf(curr.data) + ",";
      curr = curr.next;
    }
    return s.substring(0, s.length() - 1) + "]";
  }

  void add(int val) {
    Node newNode = new Node(val);
    if (first == null) first = newNode; else {
      Node curr = first;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    }
    size++;
  }

  void add(int index, int val) {
    if (index > size || index < 0) {
      System.out.println("invalid index");
      return;
    }
    if (index == 0) {
      addFirst(val);
    } else {
      Node newNode = new Node(val);
      Node curr = first;

      for (int i = 0; i < index; i++) {
        curr = curr.next;
      }
      newNode.next = curr.next;
      curr.next = newNode;

      size++;
    }
  }

  void addFirst(int val) {
    Node newNode = new Node(val);
    newNode.next = first;
    first = newNode;
  }

  Node search(int key) {
   // int index = -1;
    Node curr = first;
    while (curr != null && curr.data != key) {
     // index++;
      curr = curr.next;
    }
    if (curr == null) return null;

    return curr;
  }

  Node delet(int key) {
    Node curr = first;
    Node pre = first;
    while (curr.data != key) {
      pre = curr;
      curr = curr.next;
    }
    pre.next = curr.next;
    size--;
    return curr;
  }
}
// public boolean hasCycle(ListNode head) {
// while (head != null) {
// if (head.val == 1_000_000)
// return true;
// head.val = 1_000_000;
// head = head.next;
// }
// return false;
// }
