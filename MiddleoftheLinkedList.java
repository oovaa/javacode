public class MiddleoftheLinkedList {

  public static void main(String[] args) {}

  public ListNode middleNode(ListNode head) {
    ListNode front = head;
    ListNode mid = head;
    while (front != null) {
      front = front.next;
      if (front == null) break;
      front = front.next;
      mid = mid.next;
    }
    return mid;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  public String toString() {
    return val + "";
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
