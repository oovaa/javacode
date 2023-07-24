public class Largest3SameDigitNumberinString {

  public static void main(String[] args) {
    String s = largestGoodInteger("42352338");
    System.out.println(s);
  }

  static String largestGoodInteger(String num) {
    String ans = "";
    // System.out.println(num.length());
    for (int i = 2; i < num.length(); i++) {
      if (
        num.charAt(i) == num.charAt(i - 1) &&
        num.charAt(i) == num.charAt(i - 2) &&
        (ans == "" || ans.charAt(1) < num.charAt(i))
      ) {
        ans = num.substring(i - 2, i + 1);
      }
    //   System.out.println(num.charAt(i));
    }
    return ans;
  }
}
