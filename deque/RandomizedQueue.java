import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<t> implements Iterable<t> {

  public static void main(String[] args) {
    RandomizedQueue<Integer> r = new RandomizedQueue<>();
    r.enqueue(3);
    r.enqueue(1);
    r.enqueue(2);
    r.enqueue(5);
    r.enqueue(7);
    r.enqueue(4);
    r.enqueue(9);
    r.enqueue(6);
    // System.out.println(r.isEmpty());
    // System.out.println(r.size());
    // System.out.println(r.sample());
    Iterator<Integer> t = r.iterator();
    while (t.hasNext()) {
      System.out.println(t.next());
    }
  }

  t[] arr;
  int last;
  int first;
  int size = -1;

  public RandomizedQueue() {
    arr = (t[]) new Object[1];
  }

  public boolean isEmpty() {
    return this.size == -1;
  }

  public int size() {
    return this.size + 1;
  }

  public void enqueue(t i) {
    if (i == null) throw new IllegalArgumentException();
    size++;
    if (size == this.arr.length) extend();
    arr[size] = i;
  }

  public t dequeue() {
    if (isEmpty()) throw new NoSuchElementException("Queue is empty!!");
    if (size > 4 && size < arr.length / 4) shrink();
    if (size == 0) return arr[0];

    System.out.println();

    Random r = new Random();
    int i = r.nextInt(size);
    size--;
    System.out.println("i " + i);
    t e = arr[i];
    System.out.println("e " + e);
    arr[i] = arr[size()];
    arr[size()] = null;
    return e;
  }

  public t sample() {
    if (isEmpty()) throw new NoSuchElementException("Queue is empty!!");
    Random r = new Random();
    int i = r.nextInt(size + 1);
    t e = arr[i];
    return e;
  }

  private void extend() {
    t[] hold = (t[]) new Object[arr.length * 2];
    for (int i = 0; i < arr.length; i++) {
      hold[i] = arr[i];
    }
    arr = hold;
  }

  private void shrink() {
    t[] hold = (t[]) new Object[arr.length / 2];
    for (int i = 0; i < size; i++) {
      hold[i] = arr[i];
    }
    arr = hold;
  }

  void print() {
    for (int i = 0; i < size(); i++) {
      System.out.print(arr[i] + ", ");
    }
  }

  @Override
  public Iterator<t> iterator() {
    return new RQiterator();
  }

  private class RQiterator<f> implements Iterator<f> {

    int i;

    @Override
    public boolean hasNext() {
      return i < size();
    }

    @Override
    public f next() {
      f e = (f) arr[i++];
      return e;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException(
        "unimmplemented method 'remove '"
      );
    }

    @Override
    public String toString() {
      return arr[i].toString();
    }
  }
}
// r.dequeue();
// System.out.println(r.dequeue());
// r.dequeue();
// r.dequeue();
// r.dequeue();
// r.dequeue();
// r.dequeue();
// r.dequeue();
// r.print();
// System.out.println();
// System.out.println(r.size());
// System.out.println("size " + size);
// System.out.println("arr[size] " + arr[size()]);
// print();
// System.out.println();
