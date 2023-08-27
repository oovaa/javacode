public class strWiithoutaaabbb {

  public static void main(String[] args) {
    int a = 1, b = 3;
    String s = strWiithout3a3b(a, b);
    System.out.println(s);
  }

  static String strWiithout3a3b(int a, int b) {
    String ans = "";
    int size = a + b;
    for (int i = 0; i < size; i++) {
      while (b != 0) {
        ans += "b";
        b--;
        if (b % 2 == 0) break;
      }
      while (a != 0) {
        ans += "a";
        a--;
        if (a % 2 == 0) break;
      }
    }

    return ans;
  }

  static String strWithout3a3b(int A, int B) {
    StringBuilder sb = new StringBuilder();
    while (A + B > 0) {
      int l = sb.length();
      if (l > 1 && sb.charAt(l - 2) == sb.charAt(l - 1)) {
        if (sb.charAt(l - 1) == 'a') {
          sb.append('b');
          B--;
        } else {
          sb.append('a');
          A--;
        }
      } else {
        if (A > B) {
          sb.append('a');
          A--;
        } else {
          sb.append('b');
          B--;
        }
      }
    }
    return sb.toString();
  }
}
