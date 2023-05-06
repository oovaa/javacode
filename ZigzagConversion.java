public class ZigzagConversion {

  public static void main(String[] args) {
    System.out.println(convert("PAYPALISHIRING", 4));
  }

  static String convert(String s, int numRows) {
    String ans = "";
    for (int i = 0; i < s.length(); i++) {
      ans += s.charAt(i);
      if (i % numRows == 0) ans += "\n";
    }

    return ans;
  }
}
