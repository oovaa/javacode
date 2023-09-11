public class BinaryGap {

  public static void main(String[] args) {
    System.out.println(binaryGap(9));
  }

  static int binaryGap(int n) {
    String b = Integer.toBinaryString(n);
    int max = 0, t = 0, j = b.indexOf('1');

    // System.out.println(b);
    // System.out.println(b.indexOf('1'));

    for (int i = j + 1; i < b.length(); i++) {
      if (b.charAt(i) == '1') {
        t = i - j;
        max = Math.max(t, max);
        j = i;
      }
    }
    return max;
  }
}
