// import org.w3c.dom.Node;

public class IntersectionofTwoLinkedLists {

  public static void main(String[] args) {
    int[] listA = { 4,1,8,4,5 };
    int[] listB = { 5,6,1,8,4,5 };
    malink la = new malink();
    malink lb = new malink();

    for (int i : listB) {
      lb.add(i);
    }
    for (int i : listA) {
      la.add(i);
    }
    System.out.println(getIntersectionNode(la.first, lb.first));
  }

  public static Node getIntersectionNode(Node headA, Node headB) {
    // Node fa = headA;
    Node fb = headB;
    while (headA != null) {
      while (headB != null) {
        if (headB.next != null) if (headA.next == headB.next) return headA.next;
        headB = headB.next;
        System.out.println(headA + " - " + headB);
      }
      headA = headA.next;
      headB = fb;
    }

    return null;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}
