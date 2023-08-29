public class RotateString {

  public static void main(String[] args) {
    String s = "abcde", goal = "cdeab";
    System.out.println(rotateString(s, goal));
  }

  static boolean rotateString(String s, String goal) {
    String hold;
    for (int i = 0; i < s.length(); i++) {
      if (s.equals(goal)) {
        return true;
      }

      hold = s.substring(0, 1);
      s = s.substring(1, s.length()) + hold;
    //   System.out.println("test " + i + " = " + s);
    }

    return false;
  }
}
