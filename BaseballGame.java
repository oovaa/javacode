import java.util.Stack;
public class BaseballGame {

  public static void main(String[] args) {
    String ops[] = { "5", "2", "C", "D", "+" };
    int a = calPoints2(ops);
    System.out.println(a);
  }

  static int calPoints(String[] operations) {
    int rec = 0;
    Integer v;
    for (int i = 0; i < operations.length; i++) {
      if (operations[i] == "+") {
        rec +=
          (
            calPoints(new String[] { operations[i - 1] }) +
            calPoints(new String[] { operations[i - 2] })
          );
      } else if (operations[i] == "D") {
        rec += calPoints(new String[] { operations[i - 1] }) * 2;
      } else if (operations[i] == "C") {
        rec -= calPoints(new String[] { operations[i - 1] });
      } else {
        v = Integer.parseInt(operations[i]);
        if (v >= 1 && v <= 9) rec += v;
      }
    }
    return rec;
  }
  static int calPoints2(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    int rec = 0;

    for (String op : operations) {
      if (op.equals("+")) {
        int lastValid = stack.pop();
        int secondLastValid = stack.peek();
        int currentScore = lastValid + secondLastValid;
        rec += currentScore;
        stack.push(lastValid);
        stack.push(currentScore);
      } else if (op.equals("D")) {
        int lastValid = stack.peek();
        int currentScore = lastValid * 2;
        rec += currentScore;
        stack.push(currentScore);
      } else if (op.equals("C")) {
        int lastValid = stack.pop();
        rec -= lastValid;
      } else {
        int currentScore = Integer.parseInt(op);
        rec += currentScore;
        stack.push(currentScore);
      }
    }

    return rec;
  }
}
