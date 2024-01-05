import java.util.ArrayList;
import java.util.List;

class MinStackfile {

  public static void main(String[] args) {}
}

/**
 * MinStack
 */
class MinStack {

  List<Integer> arr;
  int top = -1;
  int min;

  public MinStack() {
    arr = new ArrayList<>();
    this.min = Integer.MAX_VALUE;
  }

  public void push(int val) {
    this.arr.add(val);
    top++;
    if (top == 0) min = val; else min = (min > val) ? val : min;
  }

  public void pop() {
    if (top != -1) {
      int removedValue = arr.remove(top--);
      // Update min only if the removed value was the minimum
      if (removedValue == min && top != -1) {
        min = arr.get(0);
        for (int i = 1; i <= top; i++) {
          min = Math.min(min, arr.get(i));
        }
      }
    }
  }

  public int top() {
    return this.arr.get(top);
  }

  public int getMin() {
    return this.min;
  }
}
