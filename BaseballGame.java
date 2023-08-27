import java.util.Stack;

public class BaseballGame {

  public static void main(String[] args) {
    String ops[] = { "5", "2", "C", "D", "+" };
    int a = calPoints(ops);
    System.out.println(a);
  }

  static int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();

    int rec = 0;
    for (String p : operations) {
      if (p.equals("+")) {
        int lastE = stack.pop();
        int SeclastE = stack.peek();
        int cur = lastE + SeclastE;
        stack.push(lastE);
        stack.push(cur);
        rec += cur;
      } else if (p.equals("D")) {
        int lastE = stack.peek() * 2;
        stack.push(lastE);
        rec += lastE;
      } else if (p.equals("C")) {
        int lastE = stack.pop();
        rec -= lastE;
      } else {
        int currentScore = Integer.parseInt(p);
        rec += currentScore;
        stack.push(currentScore);
      }
    }
    return rec;
  }

//   static int calPoints2(String[] operations) {
//     Stack<Integer> stack = new Stack<>();
//     int rec = 0;

//     for (String op : operations) {
//       if (op.equals("+")) {
//         int lastValid = stack.pop();
//         int secondLastValid = stack.peek();
//         int currentScore = lastValid + secondLastValid;
//         rec += currentScore;
//         stack.push(lastValid);
//         stack.push(currentScore);
//       } else if (op.equals("D")) {
//         int lastValid = stack.peek();
//         int currentScore = lastValid * 2;
//         rec += currentScore;
//         stack.push(currentScore);
//       } else if (op.equals("C")) {
//         int lastValid = stack.pop();
//         rec -= lastValid;
//       } else {
//         int currentScore = Integer.parseInt(op);
//         rec += currentScore;
//         stack.push(currentScore);
//       }
//     }

//     return rec;
//   }
}
