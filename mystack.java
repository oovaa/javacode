import java.util.Scanner;

public class mystack {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter string :");
    String name = s.nextLine();
    stack<Character> st = new stack<>(name.length());

    for (int i = 0; i < name.length(); i++) {
      st.push(name.charAt(i));
    }
    System.out.println(st);

    String ans = "";
    for (int i = 0; i < st.capacity; i++) {
      ans += st.pop();
    }
    System.out.println(ans);
    s.close();
  }
}

class stack<T> {

  int top = -1;
  int capacity;
  Object[] arr;

  stack(int n) {
    this.arr = new Object[n];
    this.capacity = n;
  }

  void push(T n) {
    if (!isFull()) this.arr[++top] = n; else {
      System.out.println("STACK IS FULL!");
      return;
    }
  }

  Object pop() {
    if (!isEmpty()) return this.arr[top--]; else {
      System.out.println("STACK IS EMPTY!");
      return -1;
    }
  }

  Object peek() {
    return this.arr[top];
  }

  boolean isEmpty() {
    return this.top == -1;
  }

  boolean isFull() {
    return this.top == capacity - 1;
  }

  public String toString() {
    String s = "";

    for (int i = 0; i <= this.top; i++) {
      s += arr[i] + ",";
    }
    return "[" + s.substring(0, s.length() - 1) + "]";
  }
}
