public class algoc {

  public static void main(String[] args) {
    CQueue q = new CQueue(5);

    // Fails because front = -1
    q.deQueue();

    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);

    // Fails to enqueue because front == 0 && rear == SIZE - 1
    q.enQueue(6);

    q.display();

    int elem = q.deQueue();

    if (elem != -1) {
      System.out.println("Deleted Element is " + elem);
    }
    q.display();

    q.enQueue(
      7
    );/* Q has only one element, so we reset the queue after deleting it. */

    q.display();

    // Fails to enqueue because front == rear + 1
    q.enQueue(8);
  }
}

// Circular Queue implementation in Java

class CQueue {

  int SIZE; // Size of Circular Queue
  int front, rear;
  int items[] = new int[SIZE];

  CQueue(int SIZE) {
    this.SIZE = SIZE;
    front = -1;
    rear = -1;
  }

  // Check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    return front == -1;
  }

  // Adding an element
  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1) front = 0;
      rear = (rear + 1) % SIZE;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  // Removing an element
  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      element = items[front];
      if (
        front == rear
      ) {/* Q has only one element, so we reset the queue after deleting it. */
        front = -1;
        rear = -1;
      } else {
        front = (front + 1) % SIZE;
      }
      return (element);
    }
  }

  void display() {
    /* Function to display status of Circular Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for (i = front; i != rear; i = (i + 1) % SIZE) System.out.print(
        items[i] + " "
      );
      System.out.println(items[i]);
      System.out.println("Rear -> " + rear);
    }
  }
}

class queue {

  int rear = 0;
  int head = 0;
  malink lin;

  queue() {
    lin = new malink();
  }

  void offer(int n) {
    lin.addLast(n);
    head++;
  }

  int pull() {
    if (isEmpty()) {
      System.out.println("queue is empty");
      return -1;
    }
    Node h = lin.first;
    lin.first = lin.first.next;
    head--;
    return h.data;
  }

  void print() {
    if (isEmpty()) {
      System.out.println("queue is empty");
      return;
    }
    Node n = lin.first;
    String s = "[";
    while (n != null) {
      s += n.data + ", ";
      n = n.next;
    }
    System.out.println(s.substring(0, s.length() - 2) + "]");
  }

  int peek() {
    return lin.end.data;
  }

  boolean isEmpty() {
    return head == rear;
  }
}

class stack<e> {

  int top = -1;
  Object[] arr;

  stack(int n) {
    this.arr = new Object[n];
  }

  void push(e n) {
    if (isFull()) {
      System.out.println("stack  is full");
      return;
    }
    this.arr[++top] = n;
  }

  private boolean isFull() {
    return this.top == arr.length;
  }

  Object pop() {
    if (isempty()) {
      System.out.println("stack  is empty");
      return -1;
    }
    return this.arr[top--];
  }

  private boolean isempty() {
    return this.top == -1;
  }

  void print() {
    String s = "[";
    for (int j = 0; j <= top; j++) {
      s += arr[j] + ", ";
    }
    System.out.println(s.substring(0, s.length() - 2) + "]");
  }
}
