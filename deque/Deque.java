import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<t> implements Iterable<t> {

  public static void main(String[] args) {
    Deque<Integer> t = new Deque<>();
    t.addLast(1);
    t.addLast(12);
    t.addLast(14);
    t.addLast(15);
    t.addLast(16);
    t.addLast(163);
    for (Integer i : t) {
      System.out.println(i);
    }
    // System.out.println(t.removeFirst());
    //   Iterator<Integer> it = t.iterator();
    //   while (it.hasNext()) {
    //     System.out.println(it);
    //     it.next();
    //   }
  }

  Node first;
  Node last;
  int size = 0;

  class Node {

    Node next;
    Node pre;
    t data;
    // Node(int data){
    //     this.data = data;
    // }
  }

  public Deque() {}

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void addLast(t i) {
    if (i == null) throw new IllegalArgumentException();

    Node newNode = new Node();
    newNode.data = i;
    size++;
    if (size == 1) {
      this.first = newNode;
      this.last = newNode;
    } else {
      Node tNode = this.last;
      this.last = newNode;
      newNode.pre = tNode;
      tNode.next = newNode;
    }
  }

  public void addFirst(t i) {
    if (i == null) throw new IllegalArgumentException();
    Node newNode = new Node();
    newNode.data = i;
    size++;
    if (size == 1) {
      this.first = newNode;
      this.last = newNode;
    } else {
      Node tNode = this.first;
      this.first = newNode;
      tNode.pre = newNode;
      newNode.next = tNode;
    }
  }

  public t removeLast() {
    if (isEmpty()) throw new NoSuchElementException();

    t d = this.last.data;
    this.last = this.last.pre;
    this.last.next = null;
    return d;
  }

  public t removeFirst() {
    if (isEmpty()) throw new NoSuchElementException();

    t d = this.first.data;
    this.first = this.first.next;
    this.first.pre = null;
    return d;
  }

  // void print() {
  //   Node cur = this.first;
  //   System.out.print('[');
  //   while (cur != null) {
  //     System.out.print(cur.data + ", ");
  //     cur = cur.next;
  //   }
  //   System.out.print(']');
  // }

  @Override
  public Iterator<t> iterator() {
    return new ListIterator();
  }

  class ListIterator<e> implements Iterator<e> {

    Node cur = first;

    ListIterator() {}

    @Override
    public boolean hasNext() {
      return cur != null;
    }

    @Override
    public e next() {
      if (!hasNext()) throw new NoSuchElementException();
      e item = (e) cur.data;
      cur = cur.next;
      return item;
    }

    @Override
    public String toString() {
      return cur.data.toString();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    // @Override
    // public String toString() {
    //   return cur.data.toString();
    // }
  }
}
