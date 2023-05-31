import java.util.Iterator;

public class Deque<t> implements Iterable<t> {

  public static void main(String[] args) {
    Deque<Character> t = new Deque<>();
    t.addLast('f');
    t.addLast('r');
    t.addLast('u');
    t.addLast('o');
    t.addLast('w');
    Iterator<Character> it = t.iterator();
    while (it.hasNext()) {
      System.out.println(it);
      it.next();
    }


    // System.out.println(t.removeLast());
    // t.print();
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
    t d = this.last.data;
    this.last = this.last.pre;
    this.last.next = null;
    return d;
  }

  public t removeFirst() {
    t d = this.first.data;
    this.first = this.first.next;
    this.first.pre = null;
    return d;
  }

  void print() {
    Node cur = this.first;
    while (cur != null) {
      System.out.print(cur.data + ", ");
      cur = cur.next;
    }
  }

  @Override
  public Iterator<t> iterator() {
    return new ListIterator();
  }

  class ListIterator implements Iterator<t> {

    Node cur = first;
    int i = 0;

    @Override
    public boolean hasNext() {
      return cur!=null;
    }

    @Override
    public t next() {
      if (!hasNext()) throw new UnsupportedOperationException("Unimplemented method 'next'");
      t item = cur.data;
      cur = cur.next;
      return item;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public String toString() {
        return cur.data.toString();
    }
  }
}
