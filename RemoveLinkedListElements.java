public class RemoveLinkedListElements {

  public static void main(String[] args) {}

  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }
    ListNode cur = head;

    while (cur != null && cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else cur = cur.next;
    }

    return head;
  }

  public ListNode removeElements2(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }

    ListNode cur = head;
    ListNode t;

    while (cur != null && cur.next != null) {
      if (cur.next.val == val) {
        t = cur.next.next;
        cur.next.next = null;
        cur.next = t;
      } else cur = cur.next;
    }

    return head;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
