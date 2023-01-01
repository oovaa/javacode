import java.util.LinkedList;

class linky {
    static LinkedList<Integer> lin = new LinkedList<>();
    
    public static void main(String[] args) {
        
        lin.add(3);
        lin.add(54);
        lin.add(65);

        System.out.println(hasCycle(lin.get(0)));
    }

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 1_000_000)
                return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}