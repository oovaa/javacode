public class FinalValueofVariableAfterPerformingOperations {

  public static void main(String[] args) {}

  public int finalValueAfterOperations(String[] operations) {
    int x = 0;

    for (String s : operations) {
      switch (s.charAt(1)) {
        case '-':
          x -= 1;
          break;
        case '+':
          x += 1;
          break;
      }
    }
    return x;
  }
}
