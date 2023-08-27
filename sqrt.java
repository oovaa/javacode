public class sqrt {

  public static void main(String[] args) {
    int s = 9;
    System.out.println(mySqrt(s));
  }

  public static int mySqrt(int x) {
    double count = 0;
    double result;

    if (x % 2 == 0 || x == 0) {
      if (x == 0) {
        return 0;
      }
      while (x > 1) {
        x /= 2;
        count++;
      }
      result = Math.floor(count / 2);
      double result2 = Math.pow(2, result);
      int result3 = (int) result2;
      return result3;
    } else {}

    return -1;
  }
}
