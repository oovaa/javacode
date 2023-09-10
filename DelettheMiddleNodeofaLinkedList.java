public class DelettheMiddleNodeofaLinkedList {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    deleteMiddle(head);

    // Print the resulting linked list
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  static ListNode deleteMiddle(ListNode head) {
    if (head.next == null) return null; // TODO: handle single element case
    int i = 0;
    ListNode tem = head;
    while (tem != null) {
      tem = tem.next;
      i++;
    }
    i /= 2;
    i--;
    tem = head;
    for (int j = 0; j < i; j++) tem = tem.next;

    tem.next = tem.next.next;

    return head;
  }

  static ListNode deleteMiddle2(ListNode head) {
    if (head.next == null || head == null) return null;

    ListNode last = head, mid = head, preMid = head;
    int i = 0;
    while (last != null) {
      last = last.next;
      if (i % 2 == 1) {
        preMid = mid;
        mid = mid.next;
      }
      i++;
    }
    preMid.next = mid.next;

    return head;
  }
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
